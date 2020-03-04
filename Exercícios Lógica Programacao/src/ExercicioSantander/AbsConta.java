package ExercicioSantander;

public abstract class AbsConta {
    protected double balanco;
    private Cliente cliente;

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositarDinheiro(double valor){
        this.balanco += valor;
        System.out.println("Foi depositado R$ "+valor);
    }

    public void sacarDinheiro(double valor){
        this.balanco -= valor;
        System.out.println("Foi sacado R$ "+valor);
    }

}
