package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        // Concatenar dos cadenas (función concatenarCadena).

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una primer cadena:");
        String cadenaUno = sc.nextLine();
        System.out.println("Ingrese una segunda cadena:");
        String cadenaDos = sc.nextLine();

        sc.close();

        System.out.println(concatenarCadena(cadenaUno, cadenaDos));
    }

    public static String concatenarCadena(String sUno, String sDos) {
        return sUno + sDos;
    }
}
