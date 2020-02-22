package ListaObj;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args){
        System.out.println("Digite as horas trabalhadas: ");
        Scanner horasTrab = new Scanner(System.in);
        double horasTrabalhadas = horasTrab.nextDouble();
        double salarioMinimo = 1045.00;
        System.out.println("Digite o total horasExtras: ");
        Scanner extras = new Scanner(System.in);
        double horasExtras = extras.nextDouble();
        double valorHoraExtra = salarioMinimo/4;
        double valorHoraTrabalhada = salarioMinimo/8;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double quantiaExtra = valorHoraExtra * horasExtras;
        double salarioFinal = salarioBruto + quantiaExtra;
        System.out.printf("Salário Final será de: R$ %2.2f ",salarioFinal);
    }
}
