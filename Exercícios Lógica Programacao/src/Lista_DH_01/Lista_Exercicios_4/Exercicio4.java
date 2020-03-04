package Lista_DH_01.Lista_Exercicios_4;

public class Exercicio4 {
    public static void main(String[] args) {
        Tripe tripe = new Tripe();
        tripe.setDobrado(false);
        tripe.setAlturaAtual(3.0f);
        tripe.setAlturaMaxima(7f);
        tripe.setAlturaMinima(1f);
        System.out.println(tripe.prontoParaUsar());
        tripe.definirAltura(5);
        System.out.println(tripe.prontoParaUsar());
        tripe.usar();
        tripe.dobrar();
        System.out.println(tripe.prontoParaGuardar());
        tripe.definirAltura(1);
        System.out.println(tripe.prontoParaGuardar());
        tripe.guardar();

    }
}
