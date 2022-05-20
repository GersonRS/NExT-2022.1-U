package exercicio;

public abstract class Quadrilatero {
    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public void imprimirArea() {
        System.out.println(Constantes.textoPt1 + "A area é = " + this.calcularArea());
    }
}
