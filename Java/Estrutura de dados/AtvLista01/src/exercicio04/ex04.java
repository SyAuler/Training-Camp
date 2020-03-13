package exercicio04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex04 {
	/* 4. Escreva uma rotina de classe, a qual recebe um horário no formato
	 * hh:mm:ss e retorna o total em segundos.
	 * ex: dado 12:03:23 retorna 43.403 segundos 
	 */
	public static int Segundos(int hrs, int min, int seg) {
		int retorno = (hrs * 60 * 60) + (min * 60) + seg;
		return retorno;
	}
	
	public static void main (String[] args) {
		try { //tratamento de exceção/erro
	        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");
	        Scanner scn = new Scanner(System.in);
	        
	        System.out.println("Informe uma hora no formato hh:mm:ss ");
	        String timeString = scn.nextLine();
	       
	        LocalTime time = LocalTime.parse(timeString, parseFormat); //coloca para o formato hh:mm:ss
	        System.out.println(time);
	        
	        String[] arrOfStr = time.toString().split(":", 3);
	        
	        int tempo = Segundos(Integer.parseInt(arrOfStr[0]), Integer.parseInt(arrOfStr[1]), Integer.parseInt(arrOfStr[2]));
			System.out.printf("segundos %d ", tempo);
	        
			scn.close();
			
	    } catch (Exception ex) {
	        System.out.print("Formato de hora inválido");
	    }
	}
}
