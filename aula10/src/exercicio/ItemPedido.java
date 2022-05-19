package exercicio;

import java.util.ArrayList;

public class ItemPedido {
    private int quantidade;
    public static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public ItemPedido(int qtd) {

    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
