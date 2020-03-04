package ExercicioSantander;

import Lista_DH_01.Lista_Exercicios_1.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setIdConta(334665);
        cliente.setNome("Pedro de Lara");
        cliente.setRG("33.111.342-1");
        cliente.setCPF("443.554.333-00");
        ContaCorrente cc = new ContaCorrente();
        cc.setBalanco(800);
        cc.depositarDinheiro(1000);
        cc.sacarDinheiro(340);
        cc.depositarCheque(200);
        cc.setCliente(cliente);
        ContaPoupanca poupanca =  new ContaPoupanca();
        poupanca.setCliente(cliente);
        poupanca.setBalanco(800);
        poupanca.setJuros(300);
        poupanca.sacarDinheiro(200);

    }
}
