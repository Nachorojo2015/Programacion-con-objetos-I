package Herencia;

import java.util.ArrayList;

public class Club {

    public static double cuotaBase;
    public ArrayList<Deportista> socios;

    public Club() {
        cuotaBase = 30000.00;
        socios = new ArrayList<Deportista>();
    }

    public static double getCuotaBase() {
        return 0.0;
    }

    public static boolean vitalicios(int antiguedad) {
        return antiguedad > 10;
    }

    public static long getNumeroSocio() {
        return Math.round(Math.random() * 100);
    }

    public void agregarSocio(Deportista socio) {
        this.socios.add(socio);
    }

    public static void main(String[] args) {
        Tenista tenista = new Tenista(4);

        System.out.println(tenista.getCuotaMensual());
    }
}
