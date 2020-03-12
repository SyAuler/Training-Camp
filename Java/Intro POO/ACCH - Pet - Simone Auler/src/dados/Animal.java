package dados;

import java.util.ArrayList;

public class Animal implements java.io.Serializable {

    private String nome;
    private String caracteristica;
    private String nasc;
    private String sexo;
    private Raca raca;
    private Proprietario proprietario;

    public Animal(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Animal(Raca raca, Proprietario proprietario) {
        this.raca = raca;
        this.proprietario = proprietario;
    }

    public Animal(String nome, String caracteristica, String nasc, String sexo) {
        super();
        this.nome = nome;
        this.caracteristica = caracteristica;
        this.nasc = nasc;
        this.sexo = sexo;
    }

    public Raca getRaca() {
        return raca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
