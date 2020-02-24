package ListaObj2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercicio21 {
    public static void main(String[] args) {
        System.out.println("Digite o preço do produto:  ");
        Scanner precoInput = new Scanner(System.in);
        double valor = precoInput.nextDouble();
        System.out.println("Digite o código de origem: ");
        Scanner codOrigin = new Scanner(System.in);
        int codigo = codOrigin.nextInt();
        Integer[] nordeste = new Integer[]{5, 6, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        Integer[] sudeste = new Integer[]{7, 8, 9};
        Integer[] centroOeste = new Integer[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> nordesteLista = Arrays.asList(nordeste);
        List<Integer> sudesteLista = Arrays.asList(sudeste);
        List<Integer> centroOesteLista = Arrays.asList(centroOeste);
        if (codigo == 1) {
            System.out.printf("Produto feito no Sul");
        } else if (codigo == 2) {
            System.out.printf("Produto feito no Norte");
        } else if (codigo == 3) {
            System.out.printf("Produto feito no Leste");
        } else if (codigo == 4) {
            System.out.printf("Produto feito no Oeste");
        } else if (nordesteLista.contains(codigo)) {
            System.out.printf("Produto feito no Nordeste");
        }
        else if (sudesteLista.contains(codigo)) {
            System.out.printf("Produto feito no Sudeste");
        }
        else if (centroOesteLista.contains(codigo)) {
            System.out.printf("Produto feito no Centro Oeste");
        }
        else {
            System.out.printf("Código não encontrado.");
        }
    }
}
