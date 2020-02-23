package ListaObj2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        System.out.println("Digite a quantia desejada para investir:  ");
        Scanner investimento = new Scanner(System.in);
        double valor = investimento.nextDouble();
        System.out.println("O que deseja fazer ?\n1. Poupança\n2. Fundos de Renda Fixa");
        Scanner opcao = new Scanner(System.in);
        int opcaoEscolhida = opcao.nextInt();
        switch(opcaoEscolhida){
            case 1:
                valor += (valor * 0.03);
                System.out.printf("O valor corrigido será de: %.2f", valor);
                break;
            case 2:
                valor += (valor * 0.04);
                System.out.printf("O valor corrigido será de: %.2f", valor);
                break;

            default:
                System.out.println("Opção não válida");
                break;
        }

    }
}
