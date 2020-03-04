package Lista_DH_01.Lista_Exercicios_3;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atleta01 = new Atleta();
        atleta01.setNome("Armando Guerra");
        atleta01.setNivel(20);
        atleta01.setEnergia(100);
        Atleta atleta02 = new Atleta();
        atleta02.setNome("Kadu Kando");
        atleta02.setNivel(02);
        atleta02.setEnergia(30);
        Prova prova01 = new Prova();
        Prova prova02 = new Prova();
        Prova prova03 = new Prova();
        prova01.setDificuldade(30);
        prova01.setEnergiaNecessaria(10);
        prova02.setDificuldade(2);
        prova02.setEnergiaNecessaria(4);
        prova03.setDificuldade(15);
        prova03.setEnergiaNecessaria(10);
        System.out.println(prova01.podeRealizar(atleta01));
        System.out.println(prova02.podeRealizar(atleta01));
        System.out.println(prova03.podeRealizar(atleta01));
        System.out.println(prova01.podeRealizar(atleta02));
        System.out.println(prova02.podeRealizar(atleta02));
        System.out.println(prova03.podeRealizar(atleta02));


    }
}
