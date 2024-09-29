package Encapsulamiento;

public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo() {
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Tiempo [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
    }

    public int has() {
        int horasASegundos = hora * 60 * 60;
        int minutosASegundos = minuto * 60;
        int segundosTotales = segundo + horasASegundos + minutosASegundos;
        return segundosTotales;
    }

    public String sah() {
        int segundosTotales = has();
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        return horas + ":" + minutos + ":" + segundos;
    }

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(21,45,20);

        System.out.println(tiempo.has());
        System.out.println(tiempo.sah());
    }
}
