package ListaObj;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        System.out.println("Digite o salário fixo: ");
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite o total de valor das vendas: ");
        Scanner vendas = new Scanner(System.in);
        double salarioBruto = salario.nextDouble();
        double vendasTotal = vendas.nextDouble();
        double comissao = (vendasTotal * 0.04);
        double liquido = (salarioBruto + comissao);
        System.out.println(liquido);
    }
}
