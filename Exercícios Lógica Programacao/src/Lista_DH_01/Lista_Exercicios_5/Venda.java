package Lista_DH_01.Lista_Exercicios_5;

public class Venda {
    private double valorVenda;
    private Veiculo veiculo;
    private Cliente cliente;

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
