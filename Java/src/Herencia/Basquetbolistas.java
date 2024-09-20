package Herencia;

public class Basquetbolistas extends Deportista {

    private boolean federado;

    public Basquetbolistas(int cantidadEntrenamientos, boolean federado) {
        super(cantidadEntrenamientos);
        this.federado = federado;
    }

    public double getCuotaMensual() {
        if (federado) {
            return super.getCuotaBase() - super.getCuotaBase() * 0.15;
        } else {
            return super.getCuotaBase();
        }
    }

}
