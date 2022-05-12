public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private double valor;

    public Carro(String cor, double valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public Carro(String placa, String modelo, String cor, double valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
    }

    public Carro(String initPlaca, String initModelo, double initValor) {
        this.placa = initPlaca;
        this.modelo = initModelo;
        this.valor = initValor;
        this.cor = "Cinza";
    }

    public String getPlaca() {
        return placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
