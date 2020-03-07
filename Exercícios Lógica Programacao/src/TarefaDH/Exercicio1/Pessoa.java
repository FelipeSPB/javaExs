package TarefaDH.Exercicio1;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public void imprimeDados(Data nascimento){
        System.out.printf("Nome: %s\n",this.nome);
        System.out.printf("Data de Nascimento: %d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
    }
}
