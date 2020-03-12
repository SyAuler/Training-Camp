package dados;

import java.util.Date;

public class Atendimentos implements java.io.Serializable {
	private Date dataEntrada;
	private Date dataPrometida;
	private Veiculos veiculo;
	
	public Atendimentos(Veiculos veiculo) {
		this.veiculo = veiculo;
	}
	
	public Atendimentos(Date dataEntrada, Date dataPrometida) {
		this.dataEntrada = dataEntrada;
		this.dataPrometida = dataPrometida;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataPrometida() {
		return dataPrometida;
	}

	public void setDataPrometida(Date dataPrometida) {
		this.dataPrometida = dataPrometida;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
