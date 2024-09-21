package Encapsulamiento;

public class JugadorDeFutbol {

    private int cantidadDeGoles;
    private int cantidadDeInfracciones;
    private int numeroDeJugador;
    private int cantidadDePartidosJugados;

    public JugadorDeFutbol(int cantidadDeGoles, int cantidadDeInfracciones, int numeroDeJugador, int cantidadDePartidosJugados) {
        this.cantidadDeGoles = cantidadDeGoles;
        this.cantidadDeInfracciones = cantidadDeInfracciones;
        this.numeroDeJugador = numeroDeJugador;
        this.cantidadDePartidosJugados = cantidadDePartidosJugados;
    }

    public int getCantidadDeGoles() {
        return cantidadDeGoles;
    }

    public int getCantidadDeInfracciones() {
        return cantidadDeInfracciones;
    }

    public int getNumeroDeJugador() {
        return numeroDeJugador;
    }

    public int getCantidadDePartidosJugados() {
        return cantidadDePartidosJugados;
    }

    


}
