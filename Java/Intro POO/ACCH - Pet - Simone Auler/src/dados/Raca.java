package dados;

public class Raca implements java.io.Serializable {

    private int codigo;
    private String descricao;
    private TipoAnimal tipoAnimal;

    public Raca(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Raca(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
