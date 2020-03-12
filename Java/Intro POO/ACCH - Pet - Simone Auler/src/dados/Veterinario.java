package dados;

public class Veterinario implements java.io.Serializable {

    private String crmv;
    private String nome;
    private String telefone;

    public Veterinario(String crmv, String nome, String telefone) {
        this.crmv = crmv;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
