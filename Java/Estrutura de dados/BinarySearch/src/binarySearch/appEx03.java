package binarySearch;

import java.util.Arrays;

public class appEx03 {

	public static void main(String[] args) {

		String v[] = new String[20];
		v[0] = new String("Vilson");
		v[1] = new String("Jorge");
		v[2] = new String("Silvia");
		v[3] = new String("Pedro");
		v[4] = new String("Ana");
		v[5] = new String("Luiz");
		v[6] = new String("Maria");
		v[7] = new String("Andre");
		v[8] = new String("Aline");
		v[9] = new String("Marcelo");
		v[10] = new String("Vanessa");
		v[11] = new String("Jessica");
		v[12] = new String("Luiz");
		v[13] = new String("Barbara");
		v[14] = new String("Jose");
		v[15] = new String("Simone");
		v[16] = new String("Adilson");
		v[17] = new String("Vilmar");
		v[18] = new String("Lucas");
		v[19] = new String("Matheus");


		String key[] = new String[5];
		key[0] = new String("Silvia");
		key[1] = new String("Jose");
		key[2] = new String("Marcelo");
		key[3] = new String("Cezar");
		key[4] = new String("Abigail");

		System.out.println("--------vetor original--------------");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%s \n", (v[i]));
		}

		Arrays.sort(v);

		System.out.println("\n--------vetor ordenado--------------");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%s \n", v[i]);
		}

		System.out.println("\n--------Busca de nomes--------------");
		for (int j = 0; j < key.length; j++) {
			Boolean achou = false;
			for (int i = 0; i < v.length; i++) {
				if (key[j].equals(v[i])) {
					achou = true;
					System.out.printf("O valor %s foi encontrado na posição %d\n", v[i], i);
					break;
				}
			}
			if (achou == false) {
				System.out.printf("O valor %s não está no vetor \n", key[j]);
			}
		}
	}
}
