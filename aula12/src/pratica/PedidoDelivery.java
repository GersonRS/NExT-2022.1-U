package pratica;

public class PedidoDelivery extends Pedido {

    private Cliente cliente;

    public PedidoDelivery() {
        super();
    }

    public PedidoDelivery(String dataPedido, boolean status, double valorTotal, Cliente cliente) {
        super(dataPedido, status, valorTotal);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void statusPedido() {
        // TODO Auto-generated method stub

    }

}
