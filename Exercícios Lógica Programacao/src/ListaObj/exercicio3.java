package ListaObj;
import java.util.Scanner;

import static java.lang.Integer.*;

public class exercicio3 {
    public static void main(String[] args){
        System.out.println("Digite os números que deseja dividir: ");
        Scanner meuNums = new Scanner(System.in);
        float numUm = meuNums.nextInt();
        float numDois = meuNums.nextInt();
        System.out.println(numUm/numDois);
    }
}
