package exercicio;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private int preco;
    private String nome;

    public Midia() {

    }

    public Midia(int c, int p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Informações:" + this.codigo + ", " + this.preco + ", " + this.nome;
    }

    public void printDados() {
        System.out.println(this.getTipo() + " = " + this.getDetalhes());
    }

    public void inserirDados() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um codigo: ");
        this.codigo = 123;
        System.out.println("Insira um preco: ");
        this.preco = 20;
        System.out.println("Insira um nome: ");
        this.nome = "Batman";
        input.close();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
