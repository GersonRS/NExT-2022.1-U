package explicacao;

public class Carro extends Veiculo {

    public int porta;

    public Carro() {
    }

    public Carro(String marca, String modelo, int porta) {
        super(marca, modelo);
        this.porta = porta;
    }

    @Override
    public void mostrarValores() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("porta: " + this.porta);
    }

}
