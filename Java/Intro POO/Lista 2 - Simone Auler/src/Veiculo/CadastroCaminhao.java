package Veiculo;

public class CadastroCaminhao {

    static Caminhao cad1 = new Caminhao("DFE-2345", 2018);
    static Caminhao cad2 = new Caminhao("DFE-7896", 2016, 12);

    public static void main(String[] args) {

        cad1.setEixos(10);

        System.out.println(cad1.getVeiculo());
        System.out.println(cad2.getVeiculo());
    }
}
