package exercicio;

public class Retangulo extends Quadrilatero {
    public float lado;
    public float altura;

    public Retangulo(float lado, float altura) {
        super();
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float area = this.lado * this.altura;
        return area;
    }

    @Override
    public float calcularPerimetro() {

        return 0;
    }
}
