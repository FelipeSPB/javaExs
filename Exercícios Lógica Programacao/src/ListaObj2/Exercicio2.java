package ListaObj2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        System.out.println("Digite as notas do aluno:  ");
        Scanner notas = new Scanner(System.in);
        double nota1 = notas.nextDouble();
        double nota2 = notas.nextDouble();
        double media = (nota1 + nota2 )/2;
        if (media>=7){
            System.out.printf("O aluno foi aprovado, sua média foi: %.2f ",media);
        }
        else if (7>media && media >= 4) {
            System.out.printf("O aluno está de exame, sua média foi: %.2f ", media);
        }
        else{
            System.out.printf("O aluno foi reprovado, sua média foi: %.2f ",media);
         }
    }
}
