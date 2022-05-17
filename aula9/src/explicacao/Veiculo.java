package explicacao;

public class Veiculo {
    public String marca;
    public String modelo;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarValores() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
    }
}