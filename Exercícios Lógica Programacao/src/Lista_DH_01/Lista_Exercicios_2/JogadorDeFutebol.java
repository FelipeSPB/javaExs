package Lista_DH_01.Lista_Exercicios_2;

public class JogadorDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int xp;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setXp(int quantia){
        this.xp += quantia;
    }

    public int getXp(){
        return this.xp;
    }

    public void setEnergia(int quantia){
        this.energia = quantia;
    }

    public void setAlegria(int quantia){
        this.alegria = quantia;
    }

    public void fazerGol(){
        this.energia -= 5;
        this.alegria += 10;
        this.gols++;
        System.out.println("GOOOOL!");
    }

    public void correr(){
        this.energia -= 10;
        System.out.println("Cansei!");
    }

}
