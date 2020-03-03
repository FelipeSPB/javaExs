public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println(verificarMaior(2,3));
        System.out.println(verificarMaior(3,2));
    }
    public static boolean verificarMaior(int numA, int numB){
        if(numA > numB){
            return false;
        }
        else{
            return true;
        }

    }
}
