package ListaObj;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args){
        System.out.println("Digite os angulos do triangulo: ");
        Scanner angulos = new Scanner(System.in);
        double anguloAlfa = angulos.nextDouble();
        double anguloBeta = angulos.nextDouble();
        double anguloDelta = 180 - anguloAlfa - anguloBeta;
        System.out.println(anguloDelta);
    }
}
