package Encapsulamiento;

import java.util.ArrayList;

public class EquipoDeFutbol {

    private ArrayList<JugadorDeFutbol> jugadores;

    public EquipoDeFutbol(ArrayList<JugadorDeFutbol> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean esBuenJugador(JugadorDeFutbol jugador) {
        return jugador.getCantidadDeGoles() >= 10 && jugador.getCantidadDeInfracciones() < 5;
    }

    public int figura() {
        int numeroMejorJugador = 0;

        int cantidadDeGolesMejorJugador = 0;

        for (JugadorDeFutbol jugador : jugadores) {
            if (esBuenJugador(jugador)) {
                if (jugador.getCantidadDeGoles() > cantidadDeGolesMejorJugador) {
                    cantidadDeGolesMejorJugador = jugador.getCantidadDeGoles();
                    numeroMejorJugador = jugador.getNumeroDeJugador();
                }
            }
        }

        return numeroMejorJugador;
    }

    public boolean juegoSucio() {
        for (JugadorDeFutbol jugador : jugadores) {
            if (jugador.getCantidadDeGoles() > 0 && jugador.getCantidadDePartidosJugados() > 2
                    && jugador.getCantidadDeInfracciones() > 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<JugadorDeFutbol> jugadores = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            int cantidadDeGoles = (int) Math.round(Math.random() * 20);
            int cantidadDeInfracciones = (int) Math.round(Math.random() * 15);
            int cantidadDePartidosJugados = (int) Math.round(Math.random() * 40);
            int numeroDeJugador = (int) Math.round(Math.random() * 20);
            jugadores.add(new JugadorDeFutbol(cantidadDeGoles, cantidadDeInfracciones, numeroDeJugador,
                    cantidadDePartidosJugados));
        }

        EquipoDeFutbol equipoDeFutbol = new EquipoDeFutbol(jugadores);

        if (equipoDeFutbol.esBuenJugador(jugadores.get(5)))
            System.out.println("El jugador " + jugadores.get(5).getNumeroDeJugador() + " es un buen jugador");

        System.out.println("La figura del equipo es el " + equipoDeFutbol.figura());

        if (equipoDeFutbol.juegoSucio())
            System.out.println("El juego del equipo es sucio");
        else
            System.out.println("El juego del equipo no es sucio");
    }
}
