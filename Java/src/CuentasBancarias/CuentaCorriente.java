public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;
    
    public CuentaCorriente(double saldo, int dniTitular, double limiteDescubierto) {
        super(saldo, dniTitular);
        this.limiteDescubierto = limiteDescubierto;
    }

    
    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && dineroDisponible() >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar esa cantidad");
        }
    }

    @Override
    public double dineroDisponible() {
        return saldo + limiteDescubierto;
    }



    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    

}
