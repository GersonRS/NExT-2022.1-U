public class Roupa {
    private String codigodeBarras;
    private double tamanho;
    private int numExemplares;

    public Roupa(String codigodeBarras, double tamanho, int numExemplares) {
        this.codigodeBarras = codigodeBarras;
        this.tamanho = tamanho;
        this.numExemplares = numExemplares;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public String getCodigodeBarras() {
        return codigodeBarras;
    }

    public void setCodigodeBarras(String codigodeBarras) {
        this.codigodeBarras = codigodeBarras;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }
}
