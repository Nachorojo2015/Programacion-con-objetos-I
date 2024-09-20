package Herencia;

public class Tenista extends Deportista {

    public Tenista(int cantidadEntrenamientos) {
        super(cantidadEntrenamientos);
        
    }

    public double getCuotaMensual() {
       if (super.getDias() < 3) {
        return super.getCuotaBase() + super.getCuotaBase() * 0.5;
       } else {
        return super.getCuotaBase();
       }
    }
    
}
