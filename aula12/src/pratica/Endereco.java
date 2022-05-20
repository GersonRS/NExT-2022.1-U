package pratica;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String complemento;
    private String telefone;
    private String cidade;

    private String bairro;

    public Endereco() {
        numero = 10000000;
    }

    public Endereco(String r, int n, String cep, String c, String t, String cid,
            String b) {
        rua = r;
        this.setNumero(n);
        this.cep = cep;
        this.complemento = c;
        this.telefone = t;
        this.cidade = cid;
        this.bairro = b;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 10000 && numero < 0) {
            this.numero = 10000;
        } else {
            this.numero = numero;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
