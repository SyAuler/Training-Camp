package ex01;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.###");
        dec.setMinimumFractionDigits(3);
        dec.setMaximumFractionDigits(3);

        System.out.print("Quantas amostras deseja coletar? ");
        int qtdeAmostras = scn.nextInt();
        
        if (qtdeAmostras < 10) {
            System.out.println("Ops, A quantidade de amostras deve ser igual ou superior a 10. Reinicie sua aplicação para recomeçar!");
        } else {
            double[] arr_alturaPessoas = new double[qtdeAmostras];
            double alturaMedia = 0.0;

            for (int i = 0; i < arr_alturaPessoas.length; i++) {
                System.out.print("Informe a " + (i + 1) + " amostra: ");
                arr_alturaPessoas[i] = scn.nextDouble();
                alturaMedia += arr_alturaPessoas[i];
            }

            Arrays.sort(arr_alturaPessoas);

            dec.format(alturaMedia /= arr_alturaPessoas.length);

            System.out.print(arr_alturaPessoas[0] + " "
                    + arr_alturaPessoas[1] + " -- " + alturaMedia + " -- "
                    + arr_alturaPessoas[arr_alturaPessoas.length - 2] + " "
                    + arr_alturaPessoas[arr_alturaPessoas.length - 1]);
        }
        scn.close();
    }
}
