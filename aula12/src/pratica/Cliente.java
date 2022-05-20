package pratica;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<PedidoDelivery> listaPedidoDelivery;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String nomeUsuario, boolean status, String senha,
            ArrayList<PedidoDelivery> listaPedidoDelivery) {
        super(nome, cpf, nomeUsuario, status, senha);
        this.listaPedidoDelivery = listaPedidoDelivery;
    }

    public ArrayList<PedidoDelivery> getListaPedidoDelivery() {
        return listaPedidoDelivery;
    }

    public void setListaPedidoDelivery(ArrayList<PedidoDelivery> listaPedidoDelivery) {
        this.listaPedidoDelivery = listaPedidoDelivery;
    }

}
