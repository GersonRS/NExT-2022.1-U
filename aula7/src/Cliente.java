import java.util.ArrayList;

public class Cliente {
    private String seila;
    private Endereco endComercial;
    private Endereco endResidencial;
    // private Endereco[] end = new Endereco[5];
    private ArrayList<Roupa> listaRoupas;

    public Cliente(String nome) {
        this.seila = nome;
        this.listaRoupas = new ArrayList<Roupa>();
    }

    public ArrayList<Roupa> getListaRoupas() {
        return listaRoupas;
    }

    public void setListaRoupas(ArrayList<Roupa> listaRoupas) {
        this.listaRoupas = listaRoupas;
    }

    public String getNome() {
        return seila;
    }

    public void setNome(String nome) {
        if (nome != "Gerson") {
            this.seila = nome;
        }
    }

}
