package dados;

import java.util.ArrayList;

public class Modelos implements java.io.Serializable {

	private String codigo;
	private String descricao;
	private Marcas marca;
	
	public Modelos(Marcas marca) {
		this.marca = marca;
	}
	
	public Modelos(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Marcas getMarca() {
		return marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
