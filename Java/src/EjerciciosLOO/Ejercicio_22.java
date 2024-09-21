package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        // Determinar la longitud de una cadena (función longitud)

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        sc.close();

        System.out.println("Longitud de la cadena: " + longitud(s));
    }

    public static int longitud(String s) {
        return s.length();
    }
}
