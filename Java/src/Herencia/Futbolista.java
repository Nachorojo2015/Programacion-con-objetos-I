package Herencia;

public class Futbolista extends Deportista {

    public Futbolista(int cantidadEntrenamientos) {
        super(cantidadEntrenamientos);
    }

    
    public double getCuotaMensual() {
        double usoCancha = (super.getCuotaBase() * 0.1) * super.getDias();
        return super.getCuotaBase() + usoCancha;
    }

}
