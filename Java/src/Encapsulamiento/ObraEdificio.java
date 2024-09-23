package Encapsulamiento;

public class ObraEdificio {

    private int superficieTotalACimentar;
    private int superficieCimentada;

    public ObraEdificio(int superficieTotalACimentar) {
        this.superficieTotalACimentar = superficieTotalACimentar;
    }

    public void cimentando(int metrosDeSuperficie) {
        if (superficieCimentada + metrosDeSuperficie > superficieTotalACimentar) {
            throw new IllegalArgumentException("No hay suficiente espacio");
        } else {
            superficieCimentada += metrosDeSuperficie;
        }
    }

    public int restaPorCimentar() {
       return superficieTotalACimentar - superficieCimentada;
    }

    public boolean terminado() {
        return superficieCimentada == superficieTotalACimentar;
    }


    public static void main(String[] args) {
        ObraEdificio obraEdificio = new ObraEdificio(300);

        obraEdificio.cimentando(100);
        // obraEdificio.cimentando(400);
        obraEdificio.cimentando(200);
        System.out.println(obraEdificio.restaPorCimentar());
        if (obraEdificio.terminado()) {
            System.out.println("La obra está terminada");
        } else {
            System.out.println("La obra no está terminada");
        }
    }
}
