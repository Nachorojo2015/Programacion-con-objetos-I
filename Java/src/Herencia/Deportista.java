package Herencia;

public abstract class Deportista {

    private long numeroSocio = Club.getNumeroSocio();
    private int cantidadEntrenamientosPorSemana;
    private double cuotaBase = Club.getCuotaBase();
    
    public Deportista(int cantidadEntrenamientos) {
        this.cantidadEntrenamientosPorSemana = cantidadEntrenamientos;
    }

    public double getCuotaBase() {
        return cuotaBase;
    }

    public int getDias() {
        return cantidadEntrenamientosPorSemana;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }
}
