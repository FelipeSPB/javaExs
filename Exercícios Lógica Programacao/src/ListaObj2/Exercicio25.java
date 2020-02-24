package ListaObj2;

import java.util.Scanner;

public class Exercicio25 {
    public static double verificarHonorario(int horasExtras, int horasFaltadas){
        double honorario = horasExtras -  (2*(horasFaltadas/3));
        System.out.println(honorario);
        if(honorario > 2400){
            return 500;
        } else if (honorario > 1800 && 2400>= honorario) {
            return 400;
        } else if (honorario>1200 && 1800>= honorario) {
            return 300;
        } else if (honorario>600 && 1200>= honorario){
            return 200;
        } else {
            return 100;
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite o número de horas extras:  ");
        Scanner inputExtra = new Scanner(System.in);
        int horasExtras = inputExtra.nextInt();
        System.out.println("Digite o número de horas ausentes:  ");
        Scanner inputFalta = new Scanner(System.in);
        int horasFaltadas = inputFalta.nextInt();
        double gratificacao = verificarHonorario(horasExtras,horasFaltadas);
        System.out.printf("O colaborador ganhará R$ %.2f\n",gratificacao);
    }
}
