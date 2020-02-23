package ListaObj2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        System.out.println("Digite o saldo médio do cliente:  ");
        Scanner saldoMedio = new Scanner(System.in);
        double saldo = saldoMedio.nextDouble();
        if (saldo>400){
            double credito = saldo * 0.3;
            System.out.printf("O saldo medio é de R$ %.2f  e o crédito disponível é de R$ %.2f", saldo,credito);
        }
        else if (400>=saldo && saldo > 300 ){
            double credito = saldo * 0.25;
            System.out.printf("O saldo medio é de R$ %.2f  e o crédito disponível é de R$ %.2f", saldo,credito);
        }
        else if (300>=saldo && saldo > 200 ){
            double credito = saldo * 0.2;
            System.out.printf("O saldo medio é de R$ %.2f  e o crédito disponível é de R$ %.2f", saldo,credito);
        }
        else{
            double credito = saldo * 0.15;
            System.out.printf("O saldo medio é de R$ %.2f  e o crédito disponível é de R$ %.2f", saldo,credito);
        }
    }
}
