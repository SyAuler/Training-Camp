package Veiculo;

public class Onibus extends Veiculo {

    private int assentos;

    public Onibus(String placa, int ano) {
        super(placa, ano);
    }

    public Onibus(String placa, int ano, int lugares) {
        super(placa, ano);
        assentos = lugares;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public String getVeiculo() {
        return "Placa: " + super.getPlaca() + " Ano: " + String.valueOf(super.getAno())
                + " Quantidade de assentos: " + String.valueOf(assentos);
    }
}
