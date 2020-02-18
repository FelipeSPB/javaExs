package ListaObj;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        System.out.println("Digite o seu salário: ");
        Scanner salario = new Scanner(System.in);
        double salarioFunc = salario.nextDouble();
        double salarioMinimo = 1045.00;
        double quantidadeSM = salarioFunc/salarioMinimo;
        System.out.println(quantidadeSM);
    }
}
