import java.util.Date;

public class Especial extends Conta {

    private double limite;
    private double taxa_de_juros;

    public Especial(int numero, String nome, String cpf, Date data_abertura, double saldo, double limite,
            double taxa_de_juros) {
        super(numero, nome, cpf, data_abertura, saldo);
        this.limite = limite;
        this.taxa_de_juros = taxa_de_juros;
    }

    public String depositar(double valor) {
        double saldo_anterior = super.getSaldo();
        super.setSaldo(super.getSaldo() + valor);
        double novo_limite = limite;
        if (super.getSaldo() < 0) {
            novo_limite = super.getSaldo() + limite;
        }
        return "Deposito: Saldo anterior " + saldo_anterior + ", Deposito " + valor + ", Saldo Atual " + super.getSaldo() + ", limite " + novo_limite;
    }

    public String sacar(double valor) {
        String retorno = "";
        double negativo = 0 - this.limite;
        double saldo_maximo = super.getSaldo() - valor;
        if (saldo_maximo < negativo) {
            double saldo_negativado = negativo - saldo_maximo;
            retorno = "Tentativa de Saque: Saldo insuficiente: Saldo " + super.getSaldo() + ", Saque " + valor + ", saldos insuficientes " + saldo_negativado;
        } else {
            double saldo_anterior = super.getSaldo();
            super.setSaldo(saldo_maximo);
            double novo_limite = limite;
            if (super.getSaldo() < 0) {
                novo_limite = super.getSaldo() + limite;
            }
            retorno = "Saque: Saldo anterior " + saldo_anterior + ", Saque " + valor + ", Saldo Atual " + super.getSaldo() + ", limite " + novo_limite;
        }
        return retorno;
    }

    public String saldo_proximo_mes() {
        double juros = 0;
        double novo_limite = limite;
        if (super.getSaldo() < 0) {
            juros = super.getSaldo() * taxa_de_juros / 100;
            novo_limite = super.getSaldo() + limite;
        }
        double valor = super.getSaldo() + juros;
        return "Saldo futuro + Juros: Saldo da conta: Saldo " + valor + " Saldo com limite " + novo_limite;
    }

}
