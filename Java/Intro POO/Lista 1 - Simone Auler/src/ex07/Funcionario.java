/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

public class Funcionario {

    private int numMatricula;
    private String nome;
    private String setTrabalho;
    private float salario;
    
    public Funcionario(int numMatricula, String nome, String setTrabalho, float salario){
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.setTrabalho = setTrabalho;
        this.salario = salario;
    }

    public float reajusteSalario() {
        if (salario <= 2499.99){ 
            if (setTrabalho.equals("A")){
                salario = (float) (salario * 0.008);
            } else if (setTrabalho.equals("B")){
                salario = (float) (salario * 0.010);
            } else if (setTrabalho.equals("C")){
                salario = (float) (salario * 0.011);
            } else if (setTrabalho.equals("D")){
                salario = (float) (salario * 0.012);
            }
        }
        
        if ((salario >= 2500.00) && (salario <= 4999.99)){ 
            if (setTrabalho.equals("A")){
                salario = (float) (salario * 0.007);
            } else if (setTrabalho.equals("B")){
                salario = (float) (salario * 0.09);
            } else if (setTrabalho.equals("C")){
                salario = (float) (salario * 0.010);
            } else if (setTrabalho.equals("D")){
                salario = (float) (salario * 0.011);
            } 
        }
        
         if (salario >= 5000.00){
            if (setTrabalho.equals("A")){
                salario = (float) (salario * 0.006);
            } else if (setTrabalho.equals("B")){
                salario = (float) (salario * 0.08);
            } else if (setTrabalho.equals("C")){
                salario = (float) (salario * 0.009);
            } else if (setTrabalho.equals("D")){
                salario = (float) (salario * 0.009);
            }
        }
        return salario;
    }     
    
    public int compareTo(Funcionario salarioFinal) {
        if (this.salario < salarioFinal.salario) {
            return -1;
        }
        if (this.salario > salarioFinal.salario) {
            return 1;
        }
        return 0;
    } 
}
