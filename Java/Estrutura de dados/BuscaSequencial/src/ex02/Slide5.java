package ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Slide5 {
	
	static int indice = -1;
	static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	static List<Aluno> alunos = new ArrayList<Aluno>();
	
	static int busca_ById(int id ) {
		int retorno = -1;
		for (int i = 0; i < alunos.size(); i++) {
			if (id == alunos.get(i).getId()) {
				retorno = i;
				break;
			}
		}
		return retorno;
	}
	
	static void imprime(int indice) {
		if (indice >= 0) {
			System.out.println( ((Aluno) alunos.get(indice)).nome  + " na posicao " + String.valueOf(indice) + " do vetor");
		} else {
			System.out.println( "Aluno não encontrado" );
		}
	}
	
	public static void main(String[] args) throws ParseException {
	
		alunos.add(new Aluno(47, "Vilson", data.parse("20/01/2010")) );
		alunos.add(new Aluno(17, "Jorge", data.parse("10/02/2012")) );
		alunos.add(new Aluno(19, "Silvia", data.parse("15/03/2020")) );
		alunos.add(new Aluno(32, "Pedro", data.parse("07/10/2030")) );
		alunos.add(new Aluno(45, "Ana Maria", data.parse("12/09/2015")) );
		alunos.add(new Aluno(23, "Luiz", data.parse("05/04/2003")) );
		alunos.add(new Aluno(50, "Maria", data.parse("03/07/2009")) );
		alunos.add(new Aluno(15, "Andre", data.parse("27/12/2005")) );
		alunos.add(new Aluno(28, "Aline", data.parse("26/11/2018")) );
		
		imprime(busca_ById(47));
		imprime(busca_ById(32));
		imprime(busca_ById(19));
		imprime(busca_ById(23));
		imprime(busca_ById(21));	
	}
}
