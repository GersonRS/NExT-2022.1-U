package pratica;

import java.util.ArrayList;

public class Caixa {
    private double valorReceita;
    private String dataAbertura;
    private String dataFechamento;
    private ArrayList<Movimento> listaMovimento;

    public Caixa() {
    }

    public Caixa(double valorReceita, String dataAbertura, String dataFechamento) {
        this.valorReceita = valorReceita;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.listaMovimento = new ArrayList<Movimento>();
    }

    public double getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public ArrayList<Movimento> getListaMovimento() {
        return listaMovimento;
    }

    public void setListaMovimento(ArrayList<Movimento> listaMovimento) {
        this.listaMovimento = listaMovimento;
    }

}
