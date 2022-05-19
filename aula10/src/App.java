import explicacao.CarroAgragacao;
import explicacao.Porta;

public class App {
    public static void main(String[] args) throws Exception {

        CarroAgragacao c1 = new CarroAgragacao();
        Porta p1 = new Porta("vermelho");

        System.out.println(CarroAgragacao.p1.cor);

    }
}
