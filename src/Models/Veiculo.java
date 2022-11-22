package Models;

public class Veiculo {

    private String modelo;
    private String ano;
    private String cor;
    private long id;

    public Veiculo() {
    }

    public Veiculo(String modelo, String ano, String cor, long id) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
