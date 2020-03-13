package BuscaBinariaVetor;

import java.time.LocalDate;
import java.util.Comparator;

public class Pessoa implements Comparable {
	public int id;
	public String nome;
	public LocalDate dataNascimento;

	public Pessoa(int id, String nome, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int compareTo(Object o) {
		if (this.id < ((Pessoa) o).id) {
			return -1;
		}
		if (this.id > ((Pessoa) o).id) {
			return 1;
		} 
		return 0;
	}
}
