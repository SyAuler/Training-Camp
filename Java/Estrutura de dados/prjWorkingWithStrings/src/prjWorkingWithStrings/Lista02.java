package prjWorkingWithStrings;

public class Lista02 {
	public static int howVowel(String str) { //vogal
		String myName = "Simone Cristhina Auler";
		System.out.println(myName.toLowerCase());
		
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if ("aeiou".indexOf(str.charAt(i))>=0) {
				count++;
			}
		}
		System.out.printf("Meu nome é %s e contém %d vogais\n", myName, howVowel(myName));
		return count;
	}
	public static void main (String[] args) {
		howVowel("teste");
	}
}
