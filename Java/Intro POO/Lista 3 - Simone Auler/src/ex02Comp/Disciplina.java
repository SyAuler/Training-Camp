
package ex02Comp;

public class Disciplina {
    private String nome;
    private String sala;
    
    public Disciplina(String nome, String sala){
        this.nome = nome;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public String getSala() {
        return sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
