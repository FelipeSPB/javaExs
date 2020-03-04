package Lista_DH_01.Lista_Exercicios_3;

public class Atleta {
    private String nome;
    private int nivel;
    private int energia;

    public String getNome(){
        return this.nome;
    }
    public int getNivel(){
        return this.nivel;
    }
    public int getEnergia(){
        return this.energia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }


}
