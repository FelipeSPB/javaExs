package ListaObj;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        System.out.println("Digite o preço do produto: ");
        Scanner preco = new Scanner(System.in);
        double precoBruto = preco.nextDouble();
        double desconto = (precoBruto * 0.1);
        double precoAtual = precoBruto - desconto;
        System.out.println(precoAtual);
    }
}
