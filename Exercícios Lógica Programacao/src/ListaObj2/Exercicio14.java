package ListaObj2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        System.out.println("Digite o salário do funcionário:  ");
        Scanner salarioBruto = new Scanner(System.in);
        double salario = salarioBruto.nextDouble();
        if (300>salario){
            salario += (salario * 0.5);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=300 && 500 > salario){
            salario += (salario * 0.4);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=500 && 700>salario){
            salario += (salario * 0.3);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=700 && 800>salario){
            salario += (salario * 0.2);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=800 && 1000>=salario){
            salario += (salario * 0.1);
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else{
            salario += (salario * 0.05);
            System.out.printf("O salário será de: %.2f ",salario);
        }
    }

}
