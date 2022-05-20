package pratica;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String nomeUsuario;
    private boolean status;
    private String senha;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String nomeUsuario, boolean status, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomeUsuario = nomeUsuario;
        this.status = status;
        this.senha = senha;
        this.endereco = new Endereco();
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

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
