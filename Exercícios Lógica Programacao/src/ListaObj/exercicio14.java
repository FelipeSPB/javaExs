package ListaObj;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        System.out.println("Digite seu ano de nascimento: ");
        Scanner nascimento = new Scanner(System.in);
        int anoNasc = nascimento.nextInt();
        int anoAtual = 2020;
        int totalAnos = anoAtual - anoNasc;
        int totalMeses = totalAnos * 12;
        int totalDias = totalAnos * 365;
        int totalSemanas = totalAnos * 52;
        System.out.printf("Anos passados: %d\nTotal de Meses Passados: %d\nTotal de Semanas passadas: %d\nTotal de Dias Passados: %d",
                totalAnos,totalMeses,totalSemanas,totalDias);





    }

}
