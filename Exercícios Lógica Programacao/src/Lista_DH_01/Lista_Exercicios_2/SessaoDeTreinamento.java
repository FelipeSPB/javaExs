package Lista_DH_01.Lista_Exercicios_2;

public class SessaoDeTreinamento {

    private int experiencia;
    public void treinarA(JogadorDeFutebol jogador){
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        System.out.printf("\nO jogador tinha %d xp. ",jogador.getXp());
        jogador.setXp(1);
        System.out.printf("\nO jogador possui atualmente %d xp.",jogador.getXp());
    }

}
