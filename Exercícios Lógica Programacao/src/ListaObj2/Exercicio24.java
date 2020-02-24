package ListaObj2;
import java.util.Scanner;

public class Exercicio24 {
    public static double verificarAumentoProduto(int codCategoria, double precoProduto){
        if(codCategoria == 1 && 25>=precoProduto){
            return 0.05;
        } else if (codCategoria == 2 && 25>=precoProduto) {
            return 0.08;
        } else if (codCategoria == 3 && 25>=precoProduto) {
            return 0.1;
        } else if (codCategoria == 1 && precoProduto>25){
            return 0.12;
        } else if (codCategoria == 2 && precoProduto>25) {
            return 0.15;
        }else {
            return 0.18; /* retornará zero, pois não existe produto com outro código */
        }
    }
    public static double verificarImposto(int codCategoria, String situacao){
        if (codCategoria == 2 && situacao.equals("R")){
            return 0.05;
        }
        else{
            return 0.08;
        }
    }
    public static String classificarPreco(double valorTotal){
        if (50>=valorTotal){
            return "Barato";
        }  else if (valorTotal > 50 && 120> valorTotal){
            return "Normal";
        } else{
            return "Caro";
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite o preço do produto:  ");
        Scanner inputPreco = new Scanner(System.in);
        double precoProduto = inputPreco.nextDouble();
        System.out.println("Digite a categoria do produto:  ");
        Scanner inputCategoria = new Scanner(System.in);
        int codCategoria = inputCategoria.nextInt();
        System.out.println("Digite a situação do produto (R - Necessita Refrigeração | N - Não necessita Refrigeração");
        Scanner inputSituacao = new Scanner(System.in);
        String situacao = inputSituacao.nextLine();
        double aumentoProduto =  precoProduto * verificarAumentoProduto(codCategoria,precoProduto);
        double imposto = precoProduto * verificarImposto(codCategoria,situacao);
        double valorTotal = precoProduto + aumentoProduto + imposto;
        String classificacao = classificarPreco(valorTotal);
        System.out.printf("O Leviatã cobrará R$ %.2f\n",imposto);
        System.out.printf("Sem o leviatã você pagaria: R$ %.2f\n",(valorTotal-imposto));
        System.out.printf("O produto é %s.", classificacao);
    }
}


