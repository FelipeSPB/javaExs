package ListaObj2;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        System.out.println("Digite sua altura:  ");
        Scanner inputAltura = new Scanner(System.in);
        double altura = inputAltura.nextDouble();
        System.out.println("Digite com apenas umm letra o gênero (M - Masculino/F - Feminino): ");
        Scanner inputGenero = new Scanner(System.in);
        String genero = inputGenero.nextLine();
        String homem = "M";
        String mulher = "F";
        if (homem.equals(genero)){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Você deverá possuir %.2f kg", pesoIdeal);
        }
        else{
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Você deverá possuir %.2f kg", pesoIdeal);
        }
    }
}
