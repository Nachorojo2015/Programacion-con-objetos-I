package Encapsulamiento;


class Ticket {

    private int importe;
    private int cantidadProductos;

    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() {
        this.importe = 0;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de productos y su precio
     * unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
        if (cantidad > 0 && precioUnitario > 0) {
            this.importe += cantidad * precioUnitario;
            contarProductos(cantidad);
        }
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) {
        double descuentoImporte = (this.importe * porcentaje) / 100;
        this.importe -= descuentoImporte;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento, sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
        return this.importe;
    }

    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
        double total = this.importe;
        this.importe = 0;
        return total;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos(int productos) {
        return cantidadProductos += productos;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.agregarItem(10, 300);

        ticket.aplicarDescuento(40);

        System.out.println(ticket.calcularSubtotal());

        ticket.agregarItem(20, 400);

        System.out.println(ticket.calcularTotal());

        ticket.contarProductos(0);
    }
}