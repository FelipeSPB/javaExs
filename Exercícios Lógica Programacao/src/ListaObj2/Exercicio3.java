package ListaObj2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        System.out.println("Digite dois números:  ");
        Scanner numeros = new Scanner(System.in);
        double numero_x = numeros.nextDouble();
        double numero_y = numeros.nextDouble();
        if (numero_x > numero_y){
            System.out.printf("O numero menor é %.2f ", numero_y);
        }
        else if (numero_x == numero_y) {
            System.out.printf("Os números são iguais %.2f ", numero_y);
        }   /* fiz para não quebrar o código */
        else{
            System.out.printf("O número menor é foi: %.2f ",numero_x);
        }
    }
}
