public class Cliente {
    private String nome;
    private double saldo;
    private String cpf;
    private String conta;

    public Cliente() {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void deposita(double deposito) {
        this.setSaldo(this.getSaldo() + deposito);
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
