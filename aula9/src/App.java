import exercicio.DVD;

public class App {
    public static void imprimeTipo(Veiculo v) {
        v.tipoVeiculo();
        v.calcularQuilometragem(1);
    }

    public static void main(String[] args) throws Exception {
        // Veiculo v1 = new Veiculo();
        // v1.tipoVeiculo();
        // Carro c1 = new Carro();
        // c1.tipoVeiculo();

        // Veiculo v2 = new Carro();
        // v2.tipoVeiculo();

        // System.out.println(c1.calcularQuilometragem(1.0));

        // imprimeTipo(c1);

        DVD dvd1 = new DVD();

        dvd1.inserirDados();

        dvd1.printDados();

    }

}
