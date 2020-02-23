package ListaObj2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        System.out.println("Digite o preço do produto:  ");
        Scanner precoBruto = new Scanner(System.in);
        double preco = precoBruto.nextDouble();
        if (30>preco){
            preco -= (preco * 0);
            System.out.printf("O preco final será de: %.2f ",preco);
        }
        else if (preco>=30&& 100>= preco){
            preco -= (preco * 0.1);
            System.out.printf("O preco final será de: %.2f ",preco);
        }
        else{
            preco -= (preco * 0.15);
            System.out.printf("O preco final será de: %.2f ",preco);
        }
    }
}
