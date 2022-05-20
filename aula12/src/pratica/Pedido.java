package pratica;

import java.util.ArrayList;

public abstract class Pedido {
    private String dataPedido;
    private boolean status;
    private double valorTotal;
    private ArrayList<ItemPedido> listaPedidos = new ArrayList<ItemPedido>();
    private PagamentoNFE pagamento;

    public Pedido() {
    }

    public Pedido(String dataPedido, boolean status, double valorTotal) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.valorTotal = valorTotal;
        this.pagamento = new PagamentoNFE();
    }

    public abstract void statusPedido();

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ItemPedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<ItemPedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public PagamentoNFE getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoNFE pagamento) {
        this.pagamento = pagamento;
    }

}
