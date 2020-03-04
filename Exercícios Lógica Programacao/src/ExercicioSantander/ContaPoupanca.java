package ExercicioSantander;

public class ContaPoupanca extends AbsConta {
    private double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void recolherJuros(){
        this.balanco += juros;
        System.out.println("Foi recolhido "+this.juros);
    }
}
