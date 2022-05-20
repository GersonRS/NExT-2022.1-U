import java.util.ArrayList;

import pratica.Atendente;
import pratica.ItemPedido;
import pratica.PedidoBasico;
import pratica.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Atendente at1 = new Atendente();

        PedidoBasico pb1 = new PedidoBasico();
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        listaProdutos.add(new Produto());
        listaProdutos.add(new Produto());
        listaProdutos.add(new Produto());
        listaProdutos.add(new Produto());

        ItemPedido ip = new ItemPedido(10, listaProdutos.get(0));

        pb1.getListaPedidos().add(ip);

    }
}
