package pratica;

public class Movimento {
    private String hora;
    private double valor;

    public Movimento() {
    }

    public Movimento(String hora, double valor) {
        this.hora = hora;
        this.valor = valor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
