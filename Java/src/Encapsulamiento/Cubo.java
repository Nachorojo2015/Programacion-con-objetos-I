package Encapsulamiento;

class Cubo {

    private double longitudLado;

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) { 
        if (longitudLado > 0) {
            this.longitudLado = longitudLado;
        } else {
            System.out.println(new Error("La longitud debe ser mayor a 0"));
        }
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
        return longitudLado;
    }

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
        if (longitudLado > 0) {
            this.longitudLado = longitudLado;
        } else {
            System.out.println(new Error("La longitud del lado debe ser mayor a 0"));
        }
    }

    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
        return 6 * Math.pow(longitudLado, 2);
    }

    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
        if (areaCara > 0) {
            this.longitudLado = Math.sqrt(areaCara / 6);
        }
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
        return Math.pow(longitudLado, 3);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
        if (volumen > 0) {
            this.longitudLado = Math.pow(volumen, 1.0 / 3);
        }
    }

    public static void main(String[] args) {
        Cubo cubo = new Cubo(5);

        System.out.println("Lado cubo: " + cubo.obtenerLado());

        System.out.println("Area cubo: " + cubo.obtenerAreaCara());

        System.out.println("Volumen cubo: " + cubo.obtenerVolumen());

        cubo.cambiarLado(10);

        cubo.cambiarAreaCara(12);

        cubo.cambiarVolumen(20);

        System.out.println("Lado cubo: " + cubo.obtenerLado());

        System.out.println("Area cubo: " + cubo.obtenerAreaCara());

        System.out.println("Volumen cubo: " + cubo.obtenerVolumen());

        
    }
}