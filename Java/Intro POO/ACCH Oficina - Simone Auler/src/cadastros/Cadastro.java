package cadastros;

import java.util.ArrayList;

public interface Cadastro {

	/*
	 * - adicionar (x : Tipo) : boolean
	 * - remover (x : Tipo) : boolean
	 * - buscar (chave : tipo) : Tipo
	 * - listar() : List<Tipo>
	 * - lerArquivo() : void
	 * - gravarArquivo() : void
	 */
	
	public boolean adicionar();
	public boolean remover();
	public ArrayList gravarArquivo();
	public void listar();
	public void lerArquivo(ArrayList objeto);
}
