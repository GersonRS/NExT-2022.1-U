import java.util.ArrayList;

import exercicio2.Aviao;
import exercicio2.Companhia;
import exercicio2.MecanicoChefe;
import exercicio2.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        // Roupa p1 = new Roupa("1234", 0.50, 50);
        // Roupa p2 = new Roupa("5678", 0.60, 10);
        // Roupa p3 = new Roupa("91011", 0.80, 20);

        // Cliente c1 = new Cliente("Gerson");
        // // Gerson comprou a roupa p1
        // c1.getListaRoupas().add(p1);

        // // resposta da primeira pergunta
        // for (int i = 0; i < c1.getListaRoupas().size(); i++) {
        // System.out.println(c1.getListaRoupas().get(i).getCodigodeBarras());
        // }

        // Resolução do exercicio 2
        Companhia gol = new Companhia();
        gol.listaAviao = new ArrayList<Aviao>();

        Companhia azul = new Companhia();
        azul.listaAviao = new ArrayList<Aviao>();

        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao();

        gol.listaAviao.add(a1);
        gol.listaAviao.add(a2);

        // azul.listaAviao.add(a1);// é errado, não esta em conformidades com o diagrama

        Tipo boing = new Tipo();
        boing.nome = "boing 727";
        boing.qtdAssentos = 189;
        boing.qtdMotores = 3;

        a1.t = boing;
        a2.t = boing;

        MecanicoChefe mec1 = new MecanicoChefe();
        mec1.nome = "seu josivaldo";

        a1.mecanicoC = mec1;
        a2.mecanicoC = mec1;

        System.out.println(a1.mecanicoC.nome);

        gol.listaAviao.get(1).mecanicoC.nome = "gerson";

        System.out.println(gol.listaAviao.get(1).mecanicoC.nome);

    }
}
