
package ex02Agreg;

public class Impressora {
    
    public void ImprimeVetorChar(char vet[]){
        for(int i = 0; i < vet.length; i++){
            System.out.println("VetorChar["+i+"] = " + vet[i]);
        }
    }
    
    public void ImprimeVetorStr(String vet[]){
        for(int i = 0; i < vet.length; i++){
            System.out.println("VetorStr["+i+"] = " + vet[i]);
        }
    }
}
