package model;

import java.util.Objects;

public class ModelIngresso {
    
    private Integer codigo;
    private String nome;
    private int qtde;
    private double valor;

    public ModelIngresso(Integer codigo, String nome, int qtde, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
    }

    public ModelIngresso() {
        
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.codigo);
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
        final ModelIngresso other = (ModelIngresso) obj;
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
