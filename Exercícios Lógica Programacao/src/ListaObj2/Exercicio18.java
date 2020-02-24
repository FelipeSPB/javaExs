package ListaObj2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        System.out.println("Digite sua idade:  ");
        Scanner inputIdade = new Scanner(System.in);
        int idade = inputIdade.nextInt();
        int maioridade = 18;
        if (idade >= maioridade){
            System.out.printf("Você é maior de idade.");
        }
        else{
            System.out.printf("Você é menor de idade.");
        }
    }
}
