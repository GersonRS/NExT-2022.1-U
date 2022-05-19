package explicacao;

public class CarroAgragacao {

    public Porta[] listaPortas = new Porta[2];// isso cria os espaços na memoria para caber n portas
    {
        listaPortas[0] = new Porta("Azul");// aqui estou criando uma porta e colocando ela la na posição 0
        listaPortas[1] = new Porta("Verde");
    }
    // public int[] listaInt = new int[2];
    // {
    // listaInt[0] = 10;
    // listaInt[1] = 50;
    // }
    public Motor m1 = new Motor();

    public CarroAgragacao() {

    }
}
