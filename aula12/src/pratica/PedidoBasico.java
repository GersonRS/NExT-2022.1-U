package pratica;

public class PedidoBasico extends Pedido {
    private String nome;

    public PedidoBasico() {
        super();
    }

    public PedidoBasico(String dataPedido, boolean status, double valorTotal, String nome) {
        super(dataPedido, status, valorTotal);
        this.nome = nome;
    }

    @Override
    public void statusPedido() {
        // TODO Auto-generated method stub

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
