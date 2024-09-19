package Encapsulamiento;


class Nota {

    private int valor;

    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
        if (valorInicial < 0 || valorInicial > 10) {
            System.out.println("Nota fuera de rango");
        } else {
            this.valor = valorInicial;
        }
    }

    /**
     * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
     */
    public int obtenerValor() {
        return valor;
    }

    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
        return valor >= 4;
    }

    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
        return !aprobado();
    }

    public static void main(String[] args) {
        Nota nota = new Nota(8);

        System.out.println(nota.obtenerValor());
        if (nota.aprobado()) {
            System.out.println("Esta aprobado");
        } else {
            System.out.println("Esta desaprobado");
        }
    }
}