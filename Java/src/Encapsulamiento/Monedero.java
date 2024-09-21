package Encapsulamiento;

public class Monedero {

    private double cantidadDineroInicial;

    public Monedero(double cantidadDineroInicial) {
        this.cantidadDineroInicial = cantidadDineroInicial;
    }

    /*
     pre: La cantidad de dinero debe ser mayor a cero.
     post: Sumar dinero a la cantidad de dinero inicial.
     */

    public void ingresarDinero(double cantidadDinero) {
        if (cantidadDinero <= 0) {
            throw new IllegalArgumentException("La cantidad de dinero debe ser mayor a cero");
        } else {
            this.cantidadDineroInicial += cantidadDinero;
        }
    }

    /*
     pre: La cantidad de dinero debe ser mayor a 0
     pre: Si no hay dinero en la cuenta no se podra extraer
     post: Debe restar el dinero de la cantidad inicial
     */

    public void extraerDinero(double cantidadDinero) {
        if (cantidadDinero <= 0) {
            throw new IllegalArgumentException("La cantidad de dinero debe ser mayor a cero");
        }

        if (cantidadDineroInicial < cantidadDinero) {
            throw new IllegalArgumentException("No hay suficiente dinero en la cuenta");
        }

        this.cantidadDineroInicial -= cantidadDinero;
    }

    /*
     post: Debe mostrar la cantidad de dinero disponible
     */
    public double consultarCantidadDinero() {
        return cantidadDineroInicial;
    }

    public static void main(String[] args) {
        Monedero monedero = new Monedero(1000.0);
        monedero.ingresarDinero(500.0);
        System.out.println(monedero.consultarCantidadDinero());
        monedero.extraerDinero(800);
        System.out.println(monedero.consultarCantidadDinero());
    }
}
