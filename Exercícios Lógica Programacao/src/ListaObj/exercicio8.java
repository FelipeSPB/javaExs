package ListaObj;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        System.out.println("Digite o seu peso: ");
        Scanner peso = new Scanner(System.in);
        double pesoKg = peso.nextDouble();
        double pesoGr = (pesoKg * 1000);
        System.out.println(pesoGr);
    }
}
