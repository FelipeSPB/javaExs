package ListaObj2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        System.out.println("Digite dois números:  ");
        Scanner numeros = new Scanner(System.in);
        double numero_x = numeros.nextDouble();
        double numero_y = numeros.nextDouble();
        System.out.println("O que deseja fazer ?\n1. Média entre os números digitados\n2. Diferença pelo maior e pelo menor\n3. Produto entre os números digitados\n4. Divisão do primeiro pelo segundo ");
        Scanner opcao = new Scanner(System.in);
        int opcaoEscolhida = opcao.nextInt();
        switch(opcaoEscolhida){
            case 1:
                double media = (numero_x + numero_y)/2;
                System.out.printf("A média será de: %.2f",media);
                break;
            case 2:
                if (numero_x > numero_y){
                    double subtracao = numero_x - numero_y;
                    System.out.printf("A subtração do maior pelo menor será de: %.2f", subtracao);
                    break;
                } else{
                    double subtracao = numero_y - numero_x;
                    System.out.printf("A subtração do maior pelo menor será de: %.2f", subtracao);
                    break;
                }
            case 3:
                double produto = numero_x * numero_y;
                System.out.printf("O produto será de: %.2f", produto);
                break;

            case 4:
                double divisao = numero_x/numero_y;
                System.out.printf("A divisão será de: %.2f", divisao);
                break;
            default:
                System.out.println("Opção não válida");
                break;
       }

    }
}
