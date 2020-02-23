package ListaObj2;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        System.out.println("Digite o custo do carro de fabrica:  ");
        Scanner custoFabrica = new Scanner(System.in);
        double carroCusto = custoFabrica.nextDouble();
        if (carroCusto<12000){
            double porcDistribuidor = carroCusto * 0.05;
            double imposto = 0;
            double precoFinalCarro = carroCusto + porcDistribuidor + imposto;
            System.out.printf("O preço final será de: %.2f ", precoFinalCarro);
        }
        else if (carroCusto>=12000 && 25000 >= carroCusto) {
            double porcDistribuidor = carroCusto * 0.1;
            double imposto = carroCusto * 0.15;
            double precoFinalCarro = carroCusto + porcDistribuidor + imposto;
            System.out.printf("O preço final será de: %.2f ", precoFinalCarro);
        }
        else{
            double porcDistribuidor = carroCusto * 0.15;
            double imposto = carroCusto * 0.20;
            double precoFinalCarro = carroCusto + porcDistribuidor + imposto;
            System.out.printf("O preço final será de: %.2f ", precoFinalCarro);

        }
    }
}
