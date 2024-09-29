public class CuentaDeAhorro extends Cuenta {

    public CuentaDeAhorro(double saldo, int dniTitular) {
        super(saldo, dniTitular);
    }

    @Override
    public void retirar(double dinero) {
        if (dinero > 0 && saldo >= dinero) {
            saldo -= dinero;
        } else {
            System.out.println("No se puede retirar ese dinero");
        }
    }

    @Override
    public double dineroDisponible() {
        return saldo;
    }

    

}
