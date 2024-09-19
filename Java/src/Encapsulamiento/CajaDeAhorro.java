package Encapsulamiento;


class CajaDeAhorro {

    private String titular;
    private double saldo;

    /**
     * post: la instancia queda asignada al titular indicado y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) {
        this.titular = titularDeLaCuenta;
        this.saldo = 0;
    }

    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
        return titular;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto depositado.
     */
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("No se puede depositar un monto negativo o 0");
        }
    }

    /**
     * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
     */
    public void extraer(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            saldo -= monto;
        } else {
            System.out.println("No se puede extraer un monto negativo o mayor que el saldo");
        }
    }
}