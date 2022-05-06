public class App {
    public static void main(String[] args) throws Exception {
        // Agenda ag = new Agenda();
        // ag.setNome("Gerson");
        // ag.acrescentaMaisUmSaldo();
        // System.out.println(ag.getNome());
        // ag.imprimeMensagem();
        // int valorRetornado = ag.retornaValor();
        // System.out.println(valorRetornado);

        // Resolução do exercicio:
        // Exercicio 1

        // ● Crie um novo projeto.
        // ● Crie uma classe Cliente contendo como
        // atributos públicos o cpf e o nome do cliente.
        // ● Na classe App, crie um objeto do tipo Cliente
        // e teste o acesso aos atributos de um objeto
        // cliente.

        Cliente cli1 = new Cliente();

        cli1.cpf = "0.0.0.0.0";
        cli1.nome = "Gerson";

        System.out.println(cli1.cpf);
        System.out.println(cli1.nome);

        // Exercicio 2
        // ● Implemente uma classe chamada Conta que
        // possui como atributos privados o número e o
        // saldo da conta.
        // ● Crie um método que altera o saldo da conta e
        // outro que retorna o saldo da conta.
        // ● Na classe App, crie um objeto do tipo Conta e
        // teste o acesso aos métodos de um objeto
        // conta.

        Conta cont1 = new Conta();
        cont1.setSaldo(50.5f);

        System.out.println(cont1.getSaldo());

    }
}
