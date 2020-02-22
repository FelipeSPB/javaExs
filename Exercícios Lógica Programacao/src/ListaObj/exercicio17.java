package ListaObj;
import java.lang.Math;
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        System.out.println("Digite o valor do raio:  ");
        Scanner r = new Scanner(System.in);
        double raio = r.nextDouble();
        double pi = Math.PI;
        double comprimento = 2 * raio * pi;
        double areaEsfera = 4 * pi * Math.pow(raio,2);  /*a fórmula dada pelo exercício está errada. */
        double volumeEsfera = (4/3) * pi * Math.pow(raio,3); /* a fórmula dada pelo exercício também está errada. */
        System.out.printf("O comprimento da esfera: %2.2f\nA área da esfera: %2.2f\nO volume da esfera: %2.2f", comprimento,areaEsfera,volumeEsfera);
    }
}
