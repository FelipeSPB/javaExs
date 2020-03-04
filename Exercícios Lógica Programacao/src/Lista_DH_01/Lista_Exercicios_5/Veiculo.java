package Lista_DH_01.Lista_Exercicios_5;

public class Veiculo {
    private String marca;
    private String modelo;
    private String anoFabricacao;
    private String cor;
    private double quilometragem;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
}
