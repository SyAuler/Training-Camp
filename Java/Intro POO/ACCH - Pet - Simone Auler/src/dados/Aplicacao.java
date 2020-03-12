package dados;

import java.io.Serializable;

public class Aplicacao implements Serializable {

    private double dose;
    private String lote;
    private double valor;
    private Veterinario veterinario;
    private Medicamento medicamento;
    private Atendimento atendimento;

    public Aplicacao(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    public Aplicacao(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Aplicacao(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Aplicacao(double dose, String lote, double valor){
        this.dose = dose;
        this.lote = lote;
        this.valor = valor;
    }
    
    public double getDose() {
        return dose;
    }

    public String getLote() {
        return lote;
    }

    public double getValor() {
        return valor;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }
    
    public void setDose(double dose) {
        this.dose = dose;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
}
