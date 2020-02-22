package ListaObj;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        System.out.println("Digite a quantia de dinheiro em reais:  ");
        Scanner dilmas = new Scanner(System.in);
        double reais = dilmas.nextDouble();
        double dolares = reais / 1.80;
        double libras = reais / 1.57;
        double marco = reais / 2.00;
        System.out.printf("Você tem em reais: %2.2f\nVocê tem em dólares: %2.2f\nVocê tem em libras esterlinas: %2.2f\nVocê tem em marcos alemães: %2.2f", reais,dolares,libras,marco);
    }
}
