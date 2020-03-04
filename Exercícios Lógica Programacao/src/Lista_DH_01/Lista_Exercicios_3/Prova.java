package Lista_DH_01.Lista_Exercicios_3;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;


    public int getDificuldade() {
        return this.dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta) {
        int nivelAtleta = atleta.getNivel();
        int energiaAtleta = atleta.getEnergia();
        if(nivelAtleta >= this.dificuldade && energiaAtleta >= this.energiaNecessaria){
            return true;
        } else {
            return false;
        }
    }
}