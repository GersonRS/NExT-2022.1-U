public class Bola {
    // Atributos
    public String cor;
    public int tamanho;
    public boolean cheia;

    // Métodos

    public void encher() {
        cheia = true;
    }

    public void esvaziar() {
        cheia = false;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void definirTamanho(int tam) {
        if (tam > 0)
            tamanho = tam;
    }
}