public class Philosopher implements Runnable
{
	public static enum State {SELEEPING, EATING, TAKING_FORKS}; // enumerador - conjunto de constantes na forma de um tipo de dado
	
	private State state = State.SELEEPING; // estado possível
	private Table table;
	private int idForkLeft, idForkRight;
	
	private String name=null;
	private int id = 0;
	private volatile boolean done; // done - terminar o nosso programa; volatile - trabalhar com o valor da memoria principal, não pode ser mantido em cache
	
	public Philosopher(String name, int id, Table table, int idForkLeft, int idForkRight)
	{
		this.name = name;
		this.id = id;
		this.table = table;
		this.idForkLeft = idForkLeft;
		this.idForkRight = idForkRight;
	}
	
	public State getState()
	{
		return state;
	}
	
	private Fork[] takeForks(int idFirst, int idSecond)
	{
		Fork[] forks = {null, null};
		
		//attempt to take the first one fork
		forks[0] = table.removeFork(idFirst);
		
		//if sucess, attempt to take the other fork
		if(forks[0] != null)
			forks[1] = table.removeFork(idSecond);
		
		//if sucess
		if(forks[1] == null) {
			//put the first fork on the table
			table.putFork(idFirst, forks[0]);
			return null; //return sucess
		}
		// return sucess - the forks are with philosopher - so, he can eat
		return forks;
	}
	/*	private Fork[] takeForksCasualy()	{	return null;	}	*/
	
	private Fork[] takeForks()
	{		
		if (this.id % 2 == 0)
			return takeForks(this.idForkRight, this.idForkLeft);
		return takeForks(this.idForkLeft, this.idForkRight);
	}
	
	private void returnForks(Fork fLeft, Fork fRight)
	{
		this.state = State.TAKING_FORKS;
		table.putFork(idForkLeft, fLeft);
		table.putFork(idForkRight, fRight);
	}
	
	public void eat()
	{
		this.state = State.EATING;
		long time = 3 +(( (long) (Math.random() * 1000)) % 20);
		System.out.printf("%s eating for %d milis \n", this.name, time );
		Util.workHardFor(time);
	}
	
	public void think()
	{
		this.state = State.SELEEPING;
		long time = 3 + (((long) (Math.random() * 1000)) % 15);
		System.out.printf("%s thinking for %d milis \n", this.name, time );
		Util.waitFor(time);
	}
	
	public void done()
	{
		this.done = true;
	}
	
	@Override
	public void run()
	{
		done = false;
		while(!done)
		{
			Fork[] t = takeForks();
			if (t != null) {
				eat();	
				returnForks(t[0], t[1]);
			}
		}
	}
}
