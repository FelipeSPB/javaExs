package ListaObj2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        System.out.println("Digite o salário do funcionário:  ");
        Scanner salarioBruto = new Scanner(System.in);
        double salario = salarioBruto.nextDouble();
        if (300>=salario){
            salario += (salario * 0.35);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else{
            salario += (salario * 0.15);
            System.out.printf("O salário será de: %.2f ",salario);
        }
    }
}
