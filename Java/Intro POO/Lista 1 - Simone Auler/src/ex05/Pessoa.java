
package ex05;

public class Pessoa {
    String nome;
    int idade, idadeNova;
    
    //construtor
    public Pessoa(String nome, int idade, int idadeNova){
        this.nome = nome;
        this.idade = idade;
        this.idadeNova = idadeNova;
    }
    
    public int fazerAniversario(int idadeNova, int idade){
        int data = idade + idadeNova;
        return data;
    }
    
    public void imprimePessoa() {  
        System.out.println("Pessoa: "+nome+"\nIdade: "+idade+"\nFez aniversario! Idade: "+fazerAniversario(idadeNova, idade));      
    }     
}  

