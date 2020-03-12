import java.util.Date;

public class Conta {

    private int numero;
    private String nome;
    private String cpf;
    private Date data_abertura;
    private double saldo;

    public Conta(int numero, String nome, String cpf, Date data_abertura, double saldo) {
        super();
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.data_abertura = data_abertura;
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo + "]";
    }

}
