package Encapsulamiento;

class Cerradura {

    private int claveCerradura;
    private int cantidadFallos;

    private int contadorIntentos;
    private boolean bloqueada;
    private boolean abierta;
    private int abiertaCantidad;
    private int abiertaCantidadFallidas;

    /*
     * pre: claveDeApertura debe ser un número entero positivo.
     * pre: cantidadDeFallosConsecutivosQueLaBloquean debe ser un número entero
     * positivo.
     *
     * post: Se crea una cerradura con la clave especificada.
     * post: La cerradura está cerrada y no bloqueada.
     * post: La cantidad de intentos fallidos es 0.
     */

    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
        this.claveCerradura = claveDeApertura;
        this.cantidadFallos = cantidadDeFallosConsecutivosQueLaBloquean;
        this.contadorIntentos = 0;
        this.bloqueada = false;
        this.abierta = false;
        this.abiertaCantidad = 0;
        this.abiertaCantidadFallidas = 0;
    }

    /*
     * pre: La cerradura no debe estar bloqueada. Si la cerradura está bloqueada, no
     * se puede intentar abrirla.
     * post: Si la clave ingresada coincide con claveCerradura, la cerradura se
     * abre, el contador de fallos se reinicia a 0 y el método devuelve true.
     * Si la clave no coincide, el contador de fallos consecutivos aumenta en 1.
     * Si el número de fallos consecutivos llega a cantidadFallos, la cerradura se
     * bloquea permanentemente y el método devuelve false.
     */

    public boolean abrir(int clave) {

        if (fueBloqueada())
            return false;

        if (clave != claveCerradura) {
            this.contadorIntentos++;
            this.abiertaCantidadFallidas++;

            if (contadorIntentos == cantidadFallos) {
                this.bloqueada = true;
                return false;
            }

            return false;
        }

        this.contadorIntentos = 0;
        this.abiertaCantidad++;
        this.abierta = true;
        return true;
    }

    /*
     * pre: La cerradura debe estar abierta para poder cerrarla.
     * post: La cerradura se cierra y se reinicia el contador de intentos.
     */

    public void cerrar() {
        if (estaAbierta()) {
            this.abierta = false;
            this.contadorIntentos = 0;
        }
    }

    /*
     * post: Devuelve true si la cerradura está abierta, false en caso contrario.
     */

    public boolean estaAbierta() {
        return abierta;
    }

    /*
     * post: Devuelve true si la cerradura está cerrada, false en caso contrario.
     */

    public boolean estaCerrada() {
        return !abierta;
    }

    /*
     * post: Devuelve true si la cerradura ha sido bloqueada permanentemente debido
     * a demasiados intentos fallidos de apertura, false en caso contrario.
     */

    public boolean fueBloqueada() {
        return bloqueada;
    }

    /*
     * post: Devuelve el número total de veces que la cerradura ha sido abierta
     * exitosamente.
     */

    public int contarAperturasExitosas() {
        return abiertaCantidad;
    }

    /*
     * post: Devuelve el número total de intentos fallidos al tratar de abrir la
     * cerradura.
     */

    public int contarAperturasFallidas() {
        return abiertaCantidadFallidas;
    }

    public static void main(String[] args) {

        Cerradura c = new Cerradura(189, 3);

        System.out.println("Esta abierta: " + c.estaAbierta());
        System.out.println("Esta cerrada: " + c.estaCerrada());
        System.out.println("Esta bloqueada: " + c.fueBloqueada());

        c.abrir(189);

        System.out.println("Esta abierta: " + c.estaAbierta());
        System.out.println("Esta cerrada: " + c.estaCerrada());
        System.out.println("Esta bloqueada: " + c.fueBloqueada());

        c.cerrar();

        System.out.println("Esta abierta: " + c.estaAbierta());
        System.out.println("Esta cerrada: " + c.estaCerrada());
        System.out.println("Esta bloqueada: " + c.fueBloqueada());

        c.abrir(190);
        c.abrir(190);
        c.abrir(190);

        System.out.println("Esta abierta: " + c.estaAbierta());
        System.out.println("Esta cerrada: " + c.estaCerrada());
        System.out.println("Esta bloqueada: " + c.fueBloqueada());

    }
}
