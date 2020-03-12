import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programa {

    static List<Conta> conta = new ArrayList<Conta>();

    static public void contaInvestimentoDepositar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Investimento) conta.get(i)).depositar(valor));
            }
        }
    }

    static public void contaInvestimentoSacar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Investimento) conta.get(i)).sacar(valor));
            }
        }
    }

    static public void contaInvestimentoRemuneracao(String cpf) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Investimento) conta.get(i)).remuneracao());
            }
        }
    }

    static public void contaCorrenteDepositar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Corrente) conta.get(i)).depositar(valor));
            }
        }
    }

    static public void contaCorrenteSacar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Corrente) conta.get(i)).sacar(valor));
            }
        }
    }

    static public void contaCorrenteSaldo(String cpf) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Corrente) conta.get(i)).saldo_com_desconto());
            }
        }
    }

    static public void contaEspecialDepositar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Especial) conta.get(i)).depositar(valor));
            }
        }
    }

    static public void contaEspecialSacar(String cpf, double valor) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Especial) conta.get(i)).sacar(valor));
            }
        }
    }

    static public void contaEspecialSaldo(String cpf) {
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(((Especial) conta.get(i)).saldo_proximo_mes());
            }
        }
    }

    public static void main(String[] args) {

        conta.add(new Corrente(12345, "Simone Cristhina Auler", "041.445.998-05", new Date(), 1000.00, 18.5));
        conta.add(new Investimento(12321, "Cezar Fuhr", "020.235.223-09", new Date(), 1000.00, 0.85));
        conta.add(new Especial(10000, "Cliente especial", "032.345.634-08", new Date(), 2000.00, 5000.00, 14));

        String cpf = "020.235.223-09";
        System.out.println("Pesquisa por CPF " + cpf);
        for (int i = 0; i < conta.size(); i++) {
            if (cpf == conta.get(i).getCpf()) {
                System.out.println(conta.get(i).toString());
            }
        }

        contaInvestimentoDepositar("020.235.223-09", 500);
        contaInvestimentoSacar("020.235.223-09", 250);
        contaInvestimentoRemuneracao("020.235.223-09");
        System.out.println("                        ");

        contaCorrenteDepositar("041.445.998-05", 500);
        contaCorrenteSacar("041.445.998-05", 250);
        contaCorrenteSaldo("041.445.998-05");
        System.out.println("                        ");

        contaEspecialDepositar("032.345.634-08", 500);
        contaEspecialSacar("032.345.634-08", 3000);
        contaEspecialDepositar("032.345.634-08", 5000);
        contaEspecialSacar("032.345.634-08", 10000);
        contaEspecialSacar("032.345.634-08", 9500);
        contaEspecialSaldo("032.345.634-08");
        System.out.println("                        ");

    }
}
