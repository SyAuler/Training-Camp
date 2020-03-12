package ex01;

public class Veiculo implements java.io.Serializable {

    private String placa;
    private String modelo;

    public Veiculo(String placa, String descricao) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Veiculo other = (Veiculo) obj;
        if (placa == null) {
            if (other.placa != null) {
                return false;
            }
        } else if (!placa.equals(other.placa)) {
            return false;
        }
        return true;
    }
}
