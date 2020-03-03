import java.util.ArrayList;
public class Exercicio5 {
    public static void main(String[] args) {
        int [] vetor = {2,3,4,8};
        System.out.println(somarListaPar(vetor));

    }

    public static int somarListaPar(int[] listaNum) {
        int somaLista = 0;
        for (int indice = 0; indice < listaNum.length; indice++) {
            if (listaNum[indice] % 2 == 0) {
                somaLista += listaNum[indice];
            }
        }

        return somaLista;

        }

  }
