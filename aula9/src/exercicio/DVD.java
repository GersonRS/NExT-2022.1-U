package exercicio;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        super();
    }

    public DVD(int c, int p, String n, int f) {
        super(c, p, n);
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes()
                + this.getnFaixas();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.println("Insira o numero de faixas: ");
        this.nFaixas = 100;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

}
