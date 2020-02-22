package ListaObj2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        System.out.println("Digite três números:  ");
        Scanner numeros = new Scanner(System.in);
        double numero_x = numeros.nextDouble();
        double numero_y = numeros.nextDouble();
        double numero_z = numeros.nextDouble();
        if (numero_x > numero_y && numero_x > numero_z){
            System.out.printf("O numero maior é: %.2f ", numero_x);
        }
        else if (numero_y > numero_z && numero_y > numero_x) {
            System.out.printf("O numero maior é: %.2f ", numero_y);
        }
        else if (numero_z > numero_y && numero_z > numero_x) {
            System.out.printf("O número maior é: %.2f ",numero_z);
        }
        else{
            System.out.printf("Os três números são iguais: %.2f ",numero_z); /* fiz para não quebrar o código */
        }
    }
}
