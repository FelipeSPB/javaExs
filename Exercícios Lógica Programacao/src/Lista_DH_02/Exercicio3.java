public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(verificarInteiroImpar(15));
        System.out.println(verificarInteiroImpar(2));
    }
    public static boolean verificarInteiroImpar(int numA){
        int param = 10;
        if(numA > param && numA%2 == 1){
            return true;
        }
        else{
            return false;
        }

    }
}
