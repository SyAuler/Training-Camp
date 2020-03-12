package Veiculo;

public class CadastroOnibus {

    static Onibus cad1 = new Onibus("ABC-2345", 2015);
    static Onibus cad2 = new Onibus("ABC-5485", 2012, 20);

    public static void main(String[] args) {

        cad1.setAssentos(40);

        System.out.println(cad1.getVeiculo());
        System.out.println(cad2.getVeiculo());
    }

}
