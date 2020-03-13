package recursividade;

public class ex06 {

	public static int functionC(int n){
		   if (n == 0)
		      return (1);
		   if (n == 1)
		      return (1);
		   else
		      return(functionC(n-1)+ 2*functionC(n-2));
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.print(functionC(n));
	}
	
}

