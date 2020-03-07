package TarefaDH.Exercicio1;

public class Funcionario extends Pessoa {
    protected float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularImposto(){
        return this.salario * 0.03f;
    }


}
