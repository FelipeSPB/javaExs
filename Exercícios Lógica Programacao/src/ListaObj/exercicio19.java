package ListaObj;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        System.out.println("Digite comprimento e largura do comodo: ");
        Scanner metragem = new Scanner(System.in);
        double comprimentoComodo = metragem.nextDouble();
        double larguraComodo = metragem.nextDouble();
        double areaComodo = comprimentoComodo * larguraComodo;
        double potenciaNecessaria= areaComodo * 18;
        System.out.printf("A potencia necessaria será de: %.2f ",potenciaNecessaria);
    }
}
