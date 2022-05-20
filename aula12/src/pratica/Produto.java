package pratica;

public class Produto {
    private double peso;
    private int quantidade;
    private String nome;
    private double valor;
    private String descricao;

    public Produto() {
    }

    public Produto(double peso, int quantidade, String nome, double valor, String descricao) {
        this.peso = peso;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
