public class Carro extends Veiculo {
    @Override // isso é um decorate, isso é sobrescrita
    public void tipoVeiculo() {
        System.out.println("O veiculo é um carro");
    }

    @Override // isso é sobrescrita de método == que significa que uma classe filha esta
              // reescrevendo um método da classe pai
    public int calcularQuilometragem(int i) {
        this.calcularQuilometragem(i);
        return 10;
    }

    // isso é sobrecarga de método == quando temos muitos método com o mesmo nome,
    // isso é sobrecarga
    public int calcularQuilometragem(int k, int o) {
        return 20;
    }

    //
    public int calcularQuilometragem(double k) {
        return 30;
    }

    public void limparVidros() {
        System.out.println("limpando vidros");
    }
}
