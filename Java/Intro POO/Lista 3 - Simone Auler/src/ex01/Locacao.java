package ex01;

import java.util.Date;
import java.util.Objects;

public class Locacao implements java.io.Serializable {

    private Date retirada;
    private Date devolucao;
    private Veiculo veiculo;
    private Cliente cliente;

    public Locacao(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Locacao(Date retirada, Date devolucao) {
        this.retirada = retirada;
        this.devolucao = devolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.retirada);
        hash = 97 * hash + Objects.hashCode(this.devolucao);
        hash = 97 * hash + Objects.hashCode(this.veiculo);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locacao other = (Locacao) obj;
        if (!Objects.equals(this.retirada, other.retirada)) {
            return false;
        }
        if (!Objects.equals(this.devolucao, other.devolucao)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }
}
