package dados;

public class Bairro implements java.io.Serializable {

    private String nome;
    private double txTrans;

    public Bairro(String nome, double txTrans) {
        this.nome = nome;
        this.txTrans = txTrans;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTxTrans() {
        return txTrans;
    }

    public void setTxTrans(double txTrans) {
        this.txTrans = txTrans;
    }
}
