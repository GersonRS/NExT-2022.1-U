/**
 * javadoc
 * 
 * @author: Luiz Francisco
 * @version: 1.0
 * @todo: Print Hello World
 */
public class App {
    public static void main(String[] args) {
        // Declaração e Atribuição de Variáveis
        int numeroInteiro = 2; // 8 bits dentro da memória
        float numeroFlutuante = 2.1231f;
        double numeroDouble = (double) numeroFlutuante;
        char caracter = 'B';
        // type_variable nomeVariavel;
        // Atribuição de dados (variaveis)

        String mensagem = "Valores numero Inteiro " + numeroInteiro
                + " Numero flutuante " + numeroFlutuante + " Numero Double " + numeroDouble + " Caracter " + caracter;
        System.out.println(mensagem);
        System.out.println(numeroInteiro != 1);
        // Igualdade ==

        if (numeroInteiro == 1) {
            System.out.println("Entrou na condição");
            numeroInteiro++;
            // verdadeira
        } else if (numeroInteiro == 2) {
            // se não
            System.out.println("Entrou no 2");
        } else {
            System.out.println("Entrou no se não");
        }
        int contador = 0;
        // Laço While
        while (contador < 5) {
            // o que vai acontecer durante o laço
            System.out.println("Contador: " + contador);
            contador++;

        }

        // Laço Do-While
        contador = 0;
        do {
            System.out.println("Contador do-while: " + contador);
            contador++;
        } while (contador < 5);

        // Laço for(a=0;a<5;a++)
        for (contador = 0; contador < 5; contador++) {
            System.out.println("Contador for: " + contador);
        }
        // escolha - caso
        switch (caracter) {
            case 'L': {
                System.out.println("Luiz");
                break;
            }
            case 'G':
                System.out.println("Gerson");
                break;

            default:
                System.out.println("Opção Incorreta");
        }
        // operador ternário ?
        boolean validacao = contador == 5 ? true : false;
        mensagem = contador == 5 ? "valido" : "invalido";
    }
}