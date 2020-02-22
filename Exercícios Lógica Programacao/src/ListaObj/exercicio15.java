package ListaObj;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        System.out.println("Digite o salário de  João: ");
        Scanner salarioJoao = new Scanner(System.in);
        double salario = salarioJoao.nextDouble();
        double contaUm = 500;
        double contaDois = 789.77;
        double multaContaUm= contaUm * 0.02;
        double multaContaDois = contaDois * 0.02;
        double custoTotal = contaDois + contaUm + multaContaUm + multaContaDois;
        double salarioLiquido = salario - custoTotal;
        System.out.printf("Salário Final será de: R$ %2.2f ",salarioLiquido);





    }
}
