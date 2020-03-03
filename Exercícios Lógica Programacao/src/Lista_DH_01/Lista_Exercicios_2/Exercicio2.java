package Lista_DH_01.Lista_Exercicios_2;

public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador10 = new JogadorDeFutebol();
        jogador10.setNome("Maradona");
        jogador10.setAlegria(0);
        jogador10.setEnergia(100);
        jogador10.setXp(100);
        SessaoDeTreinamento treinoDerby = new SessaoDeTreinamento();
        treinoDerby.treinarA(jogador10);
        JogadorDeFutebol jogador07 = new JogadorDeFutebol();
        jogador07.setNome("Cristiano Ronaldo");
        jogador07.setAlegria(10);
        jogador07.setEnergia(100);
        jogador07.setXp(10);
        treinoDerby.treinarA(jogador07);


    }
}
