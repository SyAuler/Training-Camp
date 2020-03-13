package model;

import java.util.Objects;

public class ModelPacote {

    private Integer codigo;
    private String nome;
    private ModelProduto produto;
    private ModelCliente cliente;
    private ModelFilme filme;

    public ModelPacote(Integer codigo, String nome, ModelProduto produto, ModelCliente cliente, ModelFilme filme) {
        this.codigo = codigo;
        this.nome = nome;
        this.produto = produto;
        this.cliente = cliente;
        this.filme = filme;
    }

    public ModelPacote(){
    
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ModelProduto getProduto() {
        return produto;
    }

    public void setProduto(ModelProduto produto) {
        this.produto = produto;
    }

    public ModelCliente getCliente() {
        return cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }
    
    public ModelFilme getFilme() {
        return filme;
    }

    public void setFilme(ModelFilme filme) {
        this.filme = filme;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final ModelPacote other = (ModelPacote) obj;
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