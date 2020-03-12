import java.util.Date;

public class Investimento extends Conta {

    private double taxa_juros_mensal;

    public Investimento(int numero, String nome, String cpf, Date data_abertura, double saldo,
            double taxa_juros_mensal) {
        super(numero, nome, cpf, data_abertura, saldo);
        this.taxa_juros_mensal = taxa_juros_mensal;
    }

    public String depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
        return "Saldo atual da conta investimento " + super.getSaldo();
    }

    public String sacar(double valor) {
        double saldo = super.getSaldo() - valor;
        if (saldo < 0) {
            saldo = 0;
        }
        super.setSaldo(saldo);
        return "Saldo atual da conta investimento " + super.getSaldo();
    }

    public String remuneracao() {
        double valor = super.getSaldo() + (super.getSaldo() * taxa_juros_mensal / 100);
        return "Saldo da Conta + Remuneração mensal: Saldo " + valor;
    }

}
