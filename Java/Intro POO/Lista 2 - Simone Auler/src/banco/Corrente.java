import java.util.Date;

public class Corrente extends Conta {

    private double taxa_manutencao;

    public Corrente(int numero, String nome, String cpf, Date data_abertura, double saldo, double taxa_manutencao) {
        super(numero, nome, cpf, data_abertura, saldo);
        this.taxa_manutencao = taxa_manutencao;
    }

    public String depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
        return "Saldo atual da conta corrente " + super.getSaldo();
    }

    public String sacar(double valor) {
        double saldo = super.getSaldo() - valor;
        if (saldo < 0) {
            saldo = 0;
        }
        super.setSaldo(saldo);
        return "Saldo atual da conta corrente " + super.getSaldo();
    }

    public String saldo_com_desconto() {
        double saldo = super.getSaldo() - taxa_manutencao;
        return "Saldo da conta - taxas de manutenção: Saldo " + saldo;
    }
}
