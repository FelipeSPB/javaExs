package ListaObj2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        System.out.println("Digite o salário do funcionário:  ");
        Scanner salarioBruto = new Scanner(System.in);
        double salario = salarioBruto.nextDouble();
        if (500>=salario){
            salario += (salario * 0.3);
            System.out.printf("O salário %.2f ",salario);
        }
        else{
            System.out.println("O funcionário não receberá aumento.");
        }
    }
}
