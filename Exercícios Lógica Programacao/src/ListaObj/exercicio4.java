package ListaObj;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        System.out.println("Digite as duas notas: ");
        Scanner notas = new Scanner(System.in);
        double nota_mensal = notas.nextDouble();
        double nota_bimestral = notas.nextDouble();
        double peso = (nota_mensal*2) + (nota_bimestral*3);
        double media = (peso/5);
        System.out.println(media);
    }
}
