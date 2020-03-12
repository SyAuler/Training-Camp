
package ex02Comp;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    long RA;
    String nome;
    List<Avaliacao> avals;
    
    public Aluno(Long ra, String nome){
        this.RA = ra;
        this.nome = nome;
        this.avals = new ArrayList<Avaliacao>();
    }

    public float media(Disciplina discip ){
        float soma = 0;
        int cont = 0;
        
        for(Avaliacao a : avals ){
            if(a.getDisciplina().equals(discip)){
                soma += a.getNota();
                cont++;
            }
        }
        return soma / cont;
    }

    public long getRA() {
        return RA;
    }

    public String getNome() {
        return nome;
    }

    public List<Avaliacao> getAvals() {
        return avals;
    }

    public void setRA(long RA) {
        this.RA = RA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAvals(List<Avaliacao> avals) {
        this.avals = avals;
    }

    
}
