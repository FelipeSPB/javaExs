package ListaObj;
import java.lang.Math;
import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        System.out.println("Digite o valor da distância entre a parede e o começo da escada: ");
        Scanner cateto = new Scanner(System.in);
        double ca = cateto.nextDouble();
        System.out.println("Digite o graus do Angulo ");
        Scanner alfa = new Scanner(System.in);
        double angulo = alfa.nextDouble();
        double anguloDegrees = Math.toRadians(angulo);
        double coss = Math.cos(anguloDegrees);
        double hipotenusa = ca/coss;
        System.out.printf("A medida da escada será de: %.2f", hipotenusa);
    }
}
