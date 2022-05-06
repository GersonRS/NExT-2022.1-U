package classes.pasta;

//classe
public class Agenda {
    // atributos ou variaveis globais da classe Agenda
    private String nome;
    private int telefoneCliente;
    private String email;
    private float saldoDaConta;

    // metodos
    public void imprimeMensagem() {
        int telefoneCliente = 40;// variavel local
        System.out.println(this.telefoneCliente);
    }

    public int retornaValor() {
        int a = 5;
        int b = 10;
        // int c = a + b;
        return a + b;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void acrescentaMaisUmSaldo() {
        this.saldoDaConta++;
    }
}
