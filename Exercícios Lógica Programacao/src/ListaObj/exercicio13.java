package ListaObj;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        System.out.println("Digite um numero: ");
        Scanner tabuada = new Scanner(System.in);
        int numero = tabuada.nextInt();
        for (int i = 1; i<11; i++){
            int resultadoTabuada = numero * i;
            System.out.printf("%d X %d = %d\n", numero,i,resultadoTabuada);
        }


    }
}
