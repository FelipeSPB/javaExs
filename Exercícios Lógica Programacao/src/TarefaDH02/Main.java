package TarefaDH02;

import java.util.Scanner;
import java.lang.System;


public class Main{



    public static void main(String[] args) {

        System.out.println("Digite um numero A: ");
        Scanner numero = new Scanner(System.in);
        int x = numero.nextInt();
        System.out.println("Digite um numero B: ");
        Scanner numero2 = new Scanner(System.in);
        int y = numero2.nextInt();
        System.out.println("Vossa Magnificiência gostaria de: \n" +
                "1 - Soma\n" +
                "      2 - Subtração\n" +
                "      3 - Divisão\n" +
                "      4 - Multiplicação\n" +
                "      5 - Sair\n");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        switch (opcao){
            case 1:
                Soma soma = new Soma();
                System.out.println(soma.calcular(x,y));
                break;

            case 2:
                Subtracao subtracao = new Subtracao();
                System.out.println(subtracao.calcular(x,y));
                break;
            case 3:
                Divisao div = new Divisao();
                System.out.println(div.calcular(x,y));
                break;
            case 4:
                Multiplicacao mult = new Multiplicacao();
                System.out.println(mult.calcular(x,y));
                break;
            case 5:
                System.exit(0);


        }
    }
}
