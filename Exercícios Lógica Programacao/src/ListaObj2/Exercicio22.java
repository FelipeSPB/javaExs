package ListaObj2;

import java.util.Scanner;

public class Exercicio22 {
    public static int verificarIdade(int idade){
        if(20>idade){
            return 1;
        } else if (idade>=20 && 50>=idade){
            return 2;
        } else{
            return 3;
        }
    }
    public static int verificarPeso(double peso){
        if (60>peso){
            return 1;
        }  else if (peso>= 60 && 90>= peso){
            return 2;
        } else{
            return 3;
        }
    }
    public static int verificarGrupo(double grupoIdade, double grupoPeso) {
        if (grupoPeso == 1 && grupoIdade == 1) {
            return 9;
        } else if (grupoPeso == 1 && grupoIdade == 2) {
            return 6;
        } else if (grupoPeso == 1 && grupoIdade == 3) {
            return 3;
        } else if (grupoPeso == 2 && grupoIdade == 1) {
            return 8;
        } else if (grupoPeso == 2 && grupoIdade == 2) {
            return 5;
        } else if (grupoPeso == 2 && grupoIdade == 3) {
            return 2;
        } else if (grupoPeso == 3 && grupoIdade == 1) {
            return 7;
        } else if (grupoPeso == 3 && grupoIdade == 2) {
            return 4;
        } else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Digite sua idade:  ");
        Scanner inputIdade = new Scanner(System.in);
        int idade = inputIdade.nextInt();
        System.out.println("Digite seu peso:  ");
        Scanner inputPeso = new Scanner(System.in);
        double peso = inputPeso.nextDouble();
        int grupoIdade = verificarIdade(idade);
        int grupoPeso = verificarPeso(peso);
        int grupoPessoa = verificarGrupo(grupoIdade,grupoPeso);
        System.out.printf("O grupo que você fará parte é: %d",grupoPessoa);

    }
}
