package Encapsulamiento;

class TarjetaBaja {

    private double saldoTargeta;
    private int cantidadViajes;
    private int cantidadViajesColectivo;
    private int cantidadViajesSubte;

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        this.saldoTargeta = saldoInicial;
    }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
        return saldoTargeta;
    }

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
        this.saldoTargeta += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {
        if (saldoTargeta > 21.50) {
            this.saldoTargeta -= 21.50;
            this.cantidadViajes++;
            this.cantidadViajesColectivo++;
        } else {
            System.out.println("No hay dinero suficiente");
        }
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte.
     */
    public void pagarViajeEnSubte() {
        if (saldoTargeta > 19.50) {
            this.saldoTargeta -= 19.50;
            this.cantidadViajes++;
            this.cantidadViajesSubte++;
        } else {
            System.out.println("No hay dinero suficiente");
        }
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return cantidadViajes;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return cantidadViajesColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
        return cantidadViajesSubte;
    }

    public static void main(String[] args) {
        TarjetaBaja baja = new TarjetaBaja(100);

        System.out.println("Saldo targeta baja: " + baja.obtenerSaldo());

        baja.cargar(50);

        baja.pagarViajeEnColectivo();

        baja.pagarViajeEnSubte();

        System.out.println("Saldo targeta baja: " + baja.obtenerSaldo());

        
        baja.pagarViajeEnColectivo();

        baja.pagarViajeEnColectivo();

        baja.pagarViajeEnColectivo();

        baja.pagarViajeEnSubte();

        System.out.println("Saldo targeta baja: " + baja.obtenerSaldo());

        baja.pagarViajeEnColectivo();

        System.out.println("Saldo targeta baja: " + baja.obtenerSaldo());

        baja.pagarViajeEnColectivo();

        baja.cargar(50);
    }
}