package explicacao;

import java.util.ArrayList;

public class CarroComposicao {
    public ArrayList<Porta> listPortas;// esta é uma lista dinamica = infinita// como nas listas de python, aqui vc ao
                                       // invez de usar .append usa-se o add();
    public Porta[] listaPortas;// esta é uma lista estatica = tem uma qtd limite, e este é exatamente igual ao
                               // que vcs usavam em portugol
    public Motor m1;

    public CarroComposicao(double p, String c) {
        this.listaPortas = new Porta[2];
        listaPortas[0] = new Porta("Vermelha");
        listaPortas[1] = new Porta("Amarela");
        this.m1 = new Motor();
    }

}
