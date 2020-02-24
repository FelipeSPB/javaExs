package ListaObj2;

import java.util.Scanner;

public class Exercicio23 {
    public static double verificarPrecoProduto(int cod){
        if(cod>=1 && 11>cod){
            return 10;
        } else if (cod>=11 && 21>cod) {
            return 15;
        } else if (cod>=21 && 31>cod) {
            return 20;
        } else if (cod>=31 && 41>cod){
            return 30;
        }
        else {
            return 0; /* retornará zero, pois não existe produto com outro código */
        }
    }
    public static int verificarDesconto(double valorTotal){
        if (250>valorTotal){
           return 5;
        }  else if (valorTotal>= 250 && 500> valorTotal){
            return 10;
        } else{
            return 15;
        }
    }
    public static double aplicandoDesconto(double valorTotal){
        if (250>valorTotal){
            valorTotal -= (valorTotal*0.05);
            return valorTotal;
        }  else if (valorTotal>= 250 && 500> valorTotal){
            valorTotal -= (valorTotal*0.10);
            return valorTotal;
        } else{
            valorTotal -= (valorTotal*0.15);
            return valorTotal;
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite o código do produto:  ");
        Scanner inputCod = new Scanner(System.in);
        int codigoProduto = inputCod.nextInt();
        System.out.println("Digite a quantidade do produto:  ");
        Scanner inputQtd = new Scanner(System.in);
        int quantidadeProduto = inputQtd.nextInt();
        double precoCodProduto =  verificarPrecoProduto(codigoProduto);
        double valorTotal = precoCodProduto * quantidadeProduto;
        int desconto = verificarDesconto(valorTotal);
        double valorNota = aplicandoDesconto(valorTotal);
        System.out.printf("O Código %d tem o valor de: R$ %.2f\n",codigoProduto,precoCodProduto);
        System.out.printf("O Total da nota tem o valor de: R$ %.2f\n",valorTotal);
        System.out.printf("O Total de desconto é de %d por cento.\n",desconto);
        System.out.printf("O total depois do desconto: R$ %.2f ", valorNota);







    }
}
