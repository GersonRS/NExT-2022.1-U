package pratica;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Atendente> listaAtendente;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, String nomeUsuario, boolean status, String senha, String matricula,
            String cargo, double salario, ArrayList<Atendente> listaAtendente) {
        super(nome, cpf, nomeUsuario, status, senha, matricula, cargo, salario);
        this.listaAtendente = listaAtendente;
    }

    public void listaFuncionario() {

    }

    public void listaCliente() {

    }

    public void criaFuncionario() {

    }

    public ArrayList<Atendente> getListaAtendente() {
        return listaAtendente;
    }

    public void setListaAtendente(ArrayList<Atendente> listaAtendente) {
        this.listaAtendente = listaAtendente;
    }

}
