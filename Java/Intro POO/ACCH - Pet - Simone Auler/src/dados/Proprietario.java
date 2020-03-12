package dados;

public class Proprietario implements java.io.Serializable {

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Bairro bairro;

    public Proprietario(Bairro bairro) {
        this.bairro = bairro;
    }

    public Proprietario(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Bairro getBairro() {
        return bairro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
