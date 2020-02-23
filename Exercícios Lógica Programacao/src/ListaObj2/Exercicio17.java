package ListaObj2;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println("Digite a senha para acessar o sistema:  ");
        Scanner senhaFornecida = new Scanner(System.in);
        int senha = senhaFornecida.nextInt();
        int senhaAcesso = 4531;
        if (senha == senhaAcesso) {
            System.out.printf("Sucesso ! Acesso Permitido");
        }
        else{
            System.out.printf("Acesso negado.");
        }
    }
}
