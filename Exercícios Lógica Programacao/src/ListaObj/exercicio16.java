package ListaObj;
import java.lang.Math;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        System.out.println("Digite o valor do cateto adjacente e do cateto oposto: ");
        Scanner catetos = new Scanner(System.in);
        int ca = catetos.nextInt();
        int co = catetos.nextInt();
        double hipotenusa = Math.sqrt(Math.pow(ca,2)+Math.pow(co,2));
        System.out.println(hipotenusa);
    }
}
