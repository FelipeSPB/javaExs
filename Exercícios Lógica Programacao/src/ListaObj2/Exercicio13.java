package ListaObj2;

import java.util.Scanner;

class Produto{
    double valor;
    public static double descobrirAumento(double valor){
        if (50>valor){
            valor += (valor * 0.05);
            return valor;
        }
        else if (valor>=50 && 100 >= valor){
            valor += (valor * 0.1);
            return valor;
        }
        else{
            valor += (valor * 0.15);
            return valor;
        }
    }
    public static String descobrirClassificacao(double valor){
        if (80>valor){
            String classificacao = "Barato";
            return classificacao;
        }
        else if (valor>=80 && 120 >= valor){
            String classificacao = "Normal";
            return classificacao;
        }
        else if (valor > 120 && 2000 >= valor){
            String classificacao = "Caro";
            return classificacao;
        }
        else{
            String classificacao = "Muito Caro";
            return classificacao;
        }
    }
};

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Digite o preço do produto a ser aumentado:  ");
        Scanner salarioBruto = new Scanner(System.in);
        Produto produtoAumentado;
        produtoAumentado = new Produto();
        produtoAumentado.valor = salarioBruto.nextDouble();
        double novoPreco = produtoAumentado.descobrirAumento(produtoAumentado.valor);
        String novaClassificacao = produtoAumentado.descobrirClassificacao(novoPreco);
        System.out.printf("O produto cujo valor era R$ %.2f e passou a ser R$ %.2f está sendo classificado como %s", produtoAumentado.valor, novoPreco, novaClassificacao);
    }
}
