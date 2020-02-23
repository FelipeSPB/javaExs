package ListaObj2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        System.out.println("Digite o salário do funcionário:  ");
        Scanner salarioBruto = new Scanner(System.in);
        double salario = salarioBruto.nextDouble();
        if (300>salario){
            salario += (salario * 0.15);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=300 && 600 > salario){
            salario += (salario * 0.10);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=600 && 900>=salario){
            salario += (salario * 0.05);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else{
            salario += (salario * 0);
            System.out.printf("O salário será de: %.2f ",salario);
        }
    }

}
