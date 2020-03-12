
package ex08;

public class Produto {
    private static Integer codigo = 0;
	private String nome;
	private double precoUnitario;
	private Integer estoque = 0;
	private String unidadeMedida;
	
	public Produto(String nome) {
		super();
		this.codigo++;
		this.nome = nome;
	}

	public Produto(String nome, double precoUnitario) {
		super();
		this.codigo++;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public String lancarEntrada(int movimentacao) {
		this.estoque = this.estoque + movimentacao;
		return "O estoque do produto " + this.nome + " foi ajustado para " + String.valueOf(this.estoque);
	}
	
	public String lancarSaida(int movimentacao) {
		this.estoque = this.estoque - movimentacao;
		return "O estoque do produto " + this.nome + " foi ajustado para " + String.valueOf(this.estoque);
	}
	
	public String ajustarPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
		return "O preço unitário do produto " + this.nome + " foi ajustado para " + String.valueOf(this.precoUnitario);
	}
	
	@Override
	public String toString() {
	    return "Produto [nome=" + nome + ", preco="+precoUnitario+", estoque="+estoque+"]";
	}
}
