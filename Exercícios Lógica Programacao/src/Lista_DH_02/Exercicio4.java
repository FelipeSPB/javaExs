public class Exercicio4 {
    public static void main(String[] args) {
        int [] vetor = {2,3,4};
        System.out.println(somarLista(vetor));
    }

    public static int somarLista(int[] listaNum){
        int somaLista = 0;
        for (int indice = 0; indice < listaNum.length ; indice++) {
            somaLista += listaNum[indice];
        }
        return somaLista;

    }
}
