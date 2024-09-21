package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        // Comparar cadenas (función comparaCadenas)

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una primer cadena:");
        String cadenaUno = sc.nextLine();
        System.out.println("Ingrese una segunda cadena:");
        String cadenaDos = sc.nextLine();

        sc.close();

        if (compararCadenas(cadenaUno, cadenaDos)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }
    }

    public static boolean compararCadenas(String sUno, String sDos) {
        return sUno.equals(sDos);
    }
}
