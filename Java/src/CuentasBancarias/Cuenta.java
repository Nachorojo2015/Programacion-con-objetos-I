public abstract class Cuenta {

    protected double saldo;
    private int dniTitular;


    public Cuenta(double saldo, int dniTitular) {
        this.saldo = saldo;
        this.dniTitular = dniTitular;
    }

    public void depositar(double dinero) {
        if (dinero > 0) {
            this.saldo += dinero;
        }
    }

    public abstract void retirar(double dinero);

    
    public double getSaldo() {
        return saldo;
    }

    public int getDniTitular() {
        return dniTitular;
    }

    public abstract double dineroDisponible();

    public void transferir(Cuenta destino, double cantidad) {
        if (dineroDisponible() >= cantidad) {
            this.retirar(cantidad);
            destino.depositar(cantidad);
            System.out.println("Transferencia realizada a " + destino.dniTitular + " con exito");
        } else {
            System.out.println("No hay suficiente dinero para realizar la transferencia");
        }
    }

    @Override
    public String toString() {
        return "Cuenta [saldo=" + saldo + ", dniTitular=" + dniTitular + "]";
    }

    
}
