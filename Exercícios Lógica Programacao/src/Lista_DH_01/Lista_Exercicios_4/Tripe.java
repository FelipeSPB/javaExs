package Lista_DH_01.Lista_Exercicios_4;

public class Tripe {
    private boolean dobrado;
    private float alturaMaxima;
    private float alturaMinima;
    private float alturaAtual;

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setAlturaMinima(float alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void setAlturaAtual(float alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(int novaAltura){
        this.alturaAtual = novaAltura;
    }

    public void dobrar(){
        this.dobrado = true;
    }

    public void desdobrar(){
        this.dobrado = false;
    }

    public void guardar(){
       }

    public boolean prontoParaGuardar(){
        if (this.dobrado == true && this.alturaAtual == this.alturaMinima){
            return true;
        }
        return false;
    }

    public void usar(){
    }

    public boolean prontoParaUsar(){
        if (this.dobrado == false  && this.alturaAtual > (this.alturaMaxima/2)){
            return true;
        }
        return false;
    }




}
