package Lista_DH_01.Lista_Exercicios_5;

public class Exercicio5 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Astolfo");
        cliente.setSobrenome("Da Silva");
        cliente.setContato("trapmaster@gmail.com");
        Veiculo veiculo = new Veiculo();
        veiculo.setCor("Fúcsia");
        veiculo.setMarca("Fiat");
        veiculo.setModelo("500");
        veiculo.setAnoFabricacao("2020");
        veiculo.setQuilometragem(0);
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setVeiculo(veiculo);
        venda.setValorVenda(50000);
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVenda(cliente, veiculo, venda.getValorVenda());

    }
}
