package model;

import java.util.Objects;

public class ModelProduto {
    
    private Integer codigo;
    private String nome;
    private int qtde;
    private double preco;
    private ModelCategProduto categoria;

    public ModelProduto(Integer codigo, String nome, int qtde, double preco, ModelCategProduto categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
        this.categoria = categoria;
    }

    public ModelProduto() {
        
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

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ModelCategProduto categoria() {
        return categoria;
    }

    public void setCategoria(ModelCategProduto categoria) {
        this.categoria = categoria;
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
        final ModelProduto other = (ModelProduto) obj;
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
