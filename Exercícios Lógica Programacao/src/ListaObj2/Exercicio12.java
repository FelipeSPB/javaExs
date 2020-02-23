package ListaObj2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        System.out.println("Digite o salário do funcionário:  ");
        Scanner salarioBruto = new Scanner(System.in);
        double salario = salarioBruto.nextDouble();
        if (350>salario){
            salario += 100;
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=350 && 600 > salario){
            salario += 75;
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else if (salario>=600 && 900>=salario){
            salario += 50;
            System.out.printf("O salário será de: %.2f ",salario);
        }
        else{
            salario += 35;
            System.out.printf("O salário será de: %.2f ",salario);
        }
    }

}
