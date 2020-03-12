package dados;

import java.io.Serializable;

public class Realizacao  implements Serializable {

	private double horas;
	private Mecanicos mecanico;
	private Servicos servico;
	private Atendimentos atendimento;
		
	public Realizacao(Atendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	public Realizacao(double horas) {
		this.horas = horas;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public Mecanicos getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanicos mecanico) {
		this.mecanico = mecanico;
	}

	public Servicos getServico() {
		return servico;
	}

	public void setServico(Servicos servico) {
		this.servico = servico;
	}

	public Atendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	
	
}
