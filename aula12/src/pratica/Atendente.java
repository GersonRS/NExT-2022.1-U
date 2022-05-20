package pratica;

import java.util.ArrayList;

public class Atendente extends Funcionario {

    private ArrayList<PedidoBasico> listaPedidoBasico;

    public Atendente() {
        super();
    }

    public Atendente(String nome, String cpf, String nomeUsuario, boolean status, String senha, String matricula,
            String cargo, double salario, ArrayList<PedidoBasico> listaPedidoBasico) {
        super(nome, cpf, nomeUsuario, status, senha, matricula, cargo, salario);
        this.listaPedidoBasico = listaPedidoBasico;
    }

    public void listaPedido() {

    }

    public void editaPedido() {

    }

    public ArrayList<PedidoBasico> getListaPedidoBasico() {
        return listaPedidoBasico;
    }

    public void setListaPedidoBasico(ArrayList<PedidoBasico> listaPedidoBasico) {
        this.listaPedidoBasico = listaPedidoBasico;
    }

}
