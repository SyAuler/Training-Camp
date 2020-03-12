
package ex02Agreg;

public class Main {
    public static void main(String args[]){
        Impressora imprime = new Impressora();
        char vetChar[] = {'a', 'b', 'c', 'd'};
        String vetStr[] = {"Arroz", "feijão", "café"};
    
        imprime.ImprimeVetorStr(vetStr);
        imprime.ImprimeVetorChar(vetChar);
    }
}
