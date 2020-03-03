package Lista_DH_01.Lista_Exercicios_1;

import Lista_DH_01.Lista_Exercicios_1.Cliente;

public class Conta {

    public int numeroConta;
    private float saldo;
    Cliente titular;


    public void deposito(double entradaQuantia){
        this.saldo += entradaQuantia;
        System.out.printf("Foi feito um depósito de R$ %.2f\n", this.saldo);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public double getNumeroConta(){
        return this.numeroConta;
    }

    public void saque(float quantia){
        float saldoAtual = this.saldo - quantia;
        if (saldoAtual < 0){
            System.out.printf("Saldo insulficiente.\n");
        } else{
            this.saldo -= quantia;
            System.out.printf("Foi efetuado o saque de %.2f e atualmente o saldo é de %.2f\n",quantia,this.saldo);
        }
    }

}
