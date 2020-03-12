package Veiculo;

public class Caminhao extends Veiculo{
	private int eixos;
	
	public Caminhao(String placa, int ano) {
		super(placa, ano);
	}
	public Caminhao(String placa, int ano, int qtdeEixos) {
		super(placa, ano);
		eixos = qtdeEixos;
	}
	public int getQtdeEixos() { return eixos; }
	public void setEixos(int eixos) { this.eixos = eixos;}
	
	public String getVeiculo() { return "Placa: " + super.getPlaca() + " Ano: " + String.valueOf(super.getAno()) + 
									" Quantidade de eixos: " + String.valueOf(eixos); }
}
