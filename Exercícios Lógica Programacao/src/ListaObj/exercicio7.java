package ListaObj;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        System.out.println("Digite o seu peso: ");
        Scanner peso = new Scanner(System.in);
        double pesoKg = peso.nextDouble();
        double engordar = (pesoKg * 0.15);
        double emagrecer = (pesoKg * 0.20);
        System.out.printf("Se engordar 15 por cento você terá %2.2f", engordar + pesoKg);
        System.out.printf("\nSe emagrecer 20 por cento você terá %2.2f ",  pesoKg - emagrecer);
    }
}
