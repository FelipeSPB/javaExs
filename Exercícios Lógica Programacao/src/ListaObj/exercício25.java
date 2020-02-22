package ListaObj;

import java.io.PrintStream;
import java.util.Scanner;

public class exercício25 {
    public static void main(String[] args){
        System.out.println("Digite a hora e minutos ");
        Scanner horario = new Scanner(System.in);
        int horas = horario.nextInt();
        int minutos = horario.nextInt();
        int horasEmMinutos = horas * 60;
        int totalMinutos = minutos + horasEmMinutos;
        int totalSegundos = totalMinutos * 60;
        System.out.printf("Hora em minutos: %d\nTotal de Minutos Passados: %d\nTotal de Segundos passados: %d",
                horasEmMinutos, totalMinutos, totalSegundos);
    }
}
