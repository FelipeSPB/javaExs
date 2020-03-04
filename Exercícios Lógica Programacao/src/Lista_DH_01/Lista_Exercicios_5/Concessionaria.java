package Lista_DH_01.Lista_Exercicios_5;

public class Concessionaria {
    public void registrarVenda(Cliente cliente, Veiculo veiculo, double valor){
        System.out.printf("O veículo %s foi comprado pelo cliente %s pelo valor de R$ %.2f",veiculo.getModelo(),cliente.getNome(), valor);
    }
}
