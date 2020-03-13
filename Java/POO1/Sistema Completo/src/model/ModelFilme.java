package model;

import java.util.Date;
import java.util.Objects;

public class ModelFilme {
    
    private Integer codigo;
    private String nome;
    private String sinopse;
    private String duracao;
    private ModelAutor autor;
    private ModelProdutora produtora;

    public ModelFilme(Integer codigo, String nome, String sinopse, String duracao, ModelAutor autor, ModelProdutora produtora) {
        this.codigo = codigo;
        this.nome = nome;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.autor = autor;
        this.produtora = produtora;
    }

    public ModelFilme() {
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public ModelAutor getAutor() {
        return autor;
    }

    public void setAutor(ModelAutor autor) {
        this.autor = autor;
    }

    public ModelProdutora getProdutora() {
        return produtora;
    }

    public void setProdutora(ModelProdutora produtora) {
        this.produtora = produtora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelFilme other = (ModelFilme) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}
