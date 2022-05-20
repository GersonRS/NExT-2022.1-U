package pratica;

public class PagamentoNFE {
    private double valor;
    private String dataPagamento;

    public PagamentoNFE() {
    }

    public PagamentoNFE(double valor, String dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public void efetuarPagamento() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
