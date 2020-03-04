package ExercicioSantander;

public class ContaCorrente extends AbsConta{

    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public void depositarCheque(double valor){
        this.balanco += valor;
        System.out.println("Foi depositado o cheque de "+valor);
    }
}
