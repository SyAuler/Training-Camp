public class Table
{
	private Fork vFork[] = { new Fork(),
			                 new Fork(),
			                 new Fork(), 
			                 new Fork(),
			                 new Fork() };
	
	public synchronized Fork removeFork(int id)
	{
		Fork aux = vFork[id];
		vFork[id] = null;
		return aux;
	}
	
	//synchronized - precisa terminar a tarefa antes de iniciar a outra
	public synchronized void putFork(int id, Fork fork)
	{
		if(fork == null)
			return;
		vFork[id] = fork;
	}

}
