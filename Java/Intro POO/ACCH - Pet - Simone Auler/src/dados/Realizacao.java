package dados;

import java.io.Serializable;

public class Realizacao implements Serializable {

    private int qtde;
    private double valor;
    private Procedimento procedimento;
    private Atendimento atendimento;

    public Realizacao(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Realizacao(int qtde, double valor) {
        this.qtde = qtde;
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
}
