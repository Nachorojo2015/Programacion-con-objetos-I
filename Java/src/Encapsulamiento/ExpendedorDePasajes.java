package Encapsulamiento;

class ExpendedorDePasajes {

    private double precioPorKm;
    private int pasajesVendidos;
    private double distanciaMaxima;
    private double sumaDistancias;
    private double sumaPrecioPasajes;

    /*
     * pre: La distancia recorrida siempre debe ser mayor o igual a 0.
     * pre: No se pueden vender pasajes con distancia negativa o cantidad negativa.
     * post: El precio total por un pasaje es el resultado de multiplicar la
     * distancia por el precio por kilómetro.
     */

    public ExpendedorDePasajes(double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }

    /*
     * pre: No se puede vender un pasaje para una distancia negativa.
     * post: Devuelve el valor del pasaje calculado correctamente en base al precio
     * por kilómetro multiplicado por la distancia.
     * post: El número total de pasajes vendidos debe incrementarse en 1.
     */
    public double venderPasaje(double distanciaEnKm) {
        if (distanciaEnKm <= 0) {
            throw new IllegalArgumentException("No se puede vender un pasaje para una distancia negativa o nula");
        } else {
            double precioTotal = distanciaEnKm * this.precioPorKm;
            sumaPrecioPasajes += precioTotal;
            this.pasajesVendidos++;
            this.sumaDistancias += distanciaEnKm;
            if (distanciaEnKm > distanciaMaxima) {
                this.distanciaMaxima = distanciaEnKm;
            }
            return precioTotal;
        }
    }

    /*
     * pre: No se puede vender una cantidad negativa o nula de pasajes.
     * pre: La distancia del viaje no puede ser negativa.
     * post: Devuelve el total de la venta, es decir, el precio de un pasaje
     * multiplicado por la cantidad de pasajes vendidos.
     * post: El número total de pasajes vendidos debe incrementarse en la cantidad
     * especificada.
     */

    public double venderPasajes(int cantidad, double distanciaEnKm) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No se puede vender una cantidad negativa o nula de pasajes");
        }

        if (distanciaEnKm <= 0) {
            throw new IllegalArgumentException("No se puede vender un pasaje para una distancia negativa o nula");
        }

        double precioTotal = cantidad * (distanciaEnKm * precioPorKm);
        sumaPrecioPasajes += precioTotal;
        this.pasajesVendidos += cantidad;
        this.sumaDistancias += distanciaEnKm;
        if (distanciaEnKm > distanciaMaxima) {
            this.distanciaMaxima = distanciaEnKm;
        }
        return precioTotal;
    }

    /*
     * post: Retorna el número total de pasajes vendidos hasta ese momento.
     */
    public int contarPasajesVendidos() {
        return this.pasajesVendidos;
    }

    /*
     * pre: Al menos debe haberse vendido un pasaje.
     * post: Devuelve la mayor distancia para la cual se ha vendido un pasaje.
     */

    public double obtenerDistanciaMaxima() {
        if (pasajesVendidos < 1) {
            throw new IllegalStateException("No se ha vendido ningún pasaje");
        } else {
            return this.distanciaMaxima;
        }
    }

    /*
     * pre: Al menos debe haberse vendido un pasaje.
     * post: Retorna la distancia promedio de todos los pasajes vendidos.
     */
    public double calcularDistanciaPromedio() {
        if (pasajesVendidos < 1) {
            throw new IllegalStateException("No se ha vendido ningún pasaje");
        } else {
            return sumaDistancias / pasajesVendidos;
        }
    }

    /*
     * pre: Al menos debe haberse vendido un pasaje.
     * post: Devuelve el monto total recaudado por la venta de todos los pasajes.
     */
    public double calcularVentaTotal() {
        if (pasajesVendidos < 1) {
            throw new IllegalStateException("No se ha vendido ningún pasaje");
        } else {
            return sumaPrecioPasajes;
        }
    }

    public static void main(String[] args) {
        ExpendedorDePasajes expendedorDePasajes = new ExpendedorDePasajes(500);

        System.out.println(expendedorDePasajes.venderPasaje(300));
        System.out.println(expendedorDePasajes.venderPasajes(10, 100));
        // System.out.println(expendedorDePasajes.venderPasajes(6, 0));

        System.out.println(expendedorDePasajes.contarPasajesVendidos());
        System.out.println(expendedorDePasajes.obtenerDistanciaMaxima());
        System.out.println(expendedorDePasajes.calcularDistanciaPromedio());
        System.out.println(expendedorDePasajes.calcularVentaTotal());
        
    }
}
