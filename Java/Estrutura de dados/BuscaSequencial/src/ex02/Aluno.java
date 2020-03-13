package ex02;

import java.util.Comparator;
import java.util.Date;

public class Aluno implements Comparator <Aluno>{
	int id;
	String nome;
	Date dataNasc;
	
	public Aluno(int id, String nome, Date dataNasc) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getId() - o2.getId();
	}
	
}
