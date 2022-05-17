package exercicio;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD() {
        super();
    }

    public CD(int c, int p, String n, int m) {
        super(c, p, n);
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes()
                + this.getnMusicas();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero de faixas: ");
        this.nMusicas = input.nextInt();
        input.close();
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

}
