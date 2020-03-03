package Lista_DH_01.Lista_Exercicios_1;

import Lista_DH_01.Lista_Exercicios_1.Cliente;
import Lista_DH_01.Lista_Exercicios_1.Conta;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente();
        Conta contaUm = new Conta();
        clienteUm.setNomeCliente("Allan");
        clienteUm.setSobrenomeCliente("Bick");
        contaUm.setSaldo(1000);
        contaUm.numeroConta = 369124875;
        contaUm.titular = clienteUm;
        contaUm.deposito(100);
        contaUm.saque(10);
        Cliente clienteDois = new Cliente();
        Conta contaDois = new Conta();
        clienteDois.setNomeCliente("Tommy");
        clienteDois.setSobrenomeCliente("Leite");
        contaDois.setSaldo(10);
        contaDois.numeroConta = 06667;
        contaDois.titular = clienteDois;
        contaDois.saque(1000);
    }
}
