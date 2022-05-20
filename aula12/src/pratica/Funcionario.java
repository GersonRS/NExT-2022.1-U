package pratica;

public abstract class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String nomeUsuario, boolean status, String senha, String matricula,
            String cargo, double salario) {
        super(nome, cpf, nomeUsuario, status, senha);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
