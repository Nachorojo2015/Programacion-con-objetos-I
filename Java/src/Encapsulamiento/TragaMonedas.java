package Encapsulamiento;


class Tragamonedas {

    private Tambor tamborUno;
    private Tambor tamborDos;
    private Tambor tamborTres;

    /**
     * post: los 3 Tambores del Tragamonedas están en la posición 1.
     */
    public Tragamonedas() {
        tamborUno = new Tambor();
        tamborDos = new Tambor();
        tamborTres = new Tambor();
    }

    /**
     * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
     */
    public void activar() {
        tamborUno.girar();
        tamborDos.girar();
        tamborTres.girar();
    }

    /**
     * post: indica si el Tragamonedas entrega un premio a partir de la posición de
     * sus 3 Tambores.
     */
    public boolean entregaPremio() {
        return tamborUno.obtenerPosicion() == tamborDos.obtenerPosicion()
                && tamborDos.obtenerPosicion() == tamborTres.obtenerPosicion();
    }

    /**
     * post: obtiene la posición del iésimo tambor del Tragamonedas
     * pre: i => 0; i < n (n = cantidad de tambores)
     */
    public int obtenerPosicionDelTambor(int i) {
        if (i == 1) {
            return tamborUno.obtenerPosicion();
        } else if (i == 2) {
            return tamborDos.obtenerPosicion();
        } else {
            return tamborTres.obtenerPosicion();
        }
    }

    public static void main(String[] args) {
        Tragamonedas tragamonedas = new Tragamonedas();

        tragamonedas.activar();

        while (!tragamonedas.entregaPremio()) {

            int[] posiciones = { tragamonedas.obtenerPosicionDelTambor(1), tragamonedas.obtenerPosicionDelTambor(2),
                    tragamonedas.obtenerPosicionDelTambor(3) };

            System.out.println(posiciones[0] + " | " + posiciones[1] + " | " + posiciones[2]);

            if (tragamonedas.entregaPremio()) {
                System.out.println("Ganaste!");
            } else {
                System.out.println("No ganaste...");
            }

            tragamonedas.activar();
        }

        int[] posiciones = { tragamonedas.obtenerPosicionDelTambor(1), tragamonedas.obtenerPosicionDelTambor(2),
                tragamonedas.obtenerPosicionDelTambor(3) };
        System.out.println(posiciones[0] + " | " + posiciones[1] + " | " + posiciones[2]);
        System.out.println("Ganaste!");
    }
}