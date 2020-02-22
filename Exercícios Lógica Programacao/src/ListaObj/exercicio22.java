package ListaObj;
import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args){
        System.out.println("Digite o numero de lados de um polígono: ");
        Scanner n = new Scanner(System.in);
        int totalLados = n.nextInt();
        int numerosDiagonais = (totalLados * (totalLados - 3))/2;
        System.out.println(numerosDiagonais);
    }
}
