public class App {
    public static void main(String[] args) throws Exception {

        Funcionario f1 = new Funcionario();
        Empresa emp1 = new Empresa();
        Empresa emp2 = new Empresa();

        emp1.listaFuncionarios.add(f1);// igual o append do python
        if (emp1.listaFuncionarios.contains(f1)) {

        } else {
            emp2.listaFuncionarios.add(f1);// no caso de um para muitos isso não faz sentido
        }
    }
}
