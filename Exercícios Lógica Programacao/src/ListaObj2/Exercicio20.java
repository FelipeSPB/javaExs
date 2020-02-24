package ListaObj2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        System.out.println("Digite sua idade:  ");
        Scanner inputIdade = new Scanner(System.in);
        int idade = inputIdade.nextInt();
        if (idade>= 5 && 8 > idade){
            System.out.printf("Você se encontra na categoria infantil");
        }
        else if (idade >=8 && 11 > idade){
            System.out.printf("Você se encontra na categoria juvenil");
        }
        else if (idade>= 11 && 16 > idade ){
            System.out.printf("Você se encontra na categoria adolescente");
        }
        else if (idade >= 16 && 30 > idade){
            System.out.printf("Você se encontra na categoria adulto");
        }
        else if (idade >= 30){
            System.out.printf("Você se encontra na categoria Sênior");
        }
        else{
            System.out.printf("Você não é apto a ser nadador.");
        }
    }
}
