package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        // Determinar si una cadena es vacía (función esVacia)

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        sc.close();

        if (esVacia(s)) {
            System.out.println("La cadena es vacía");
        } else {
            System.out.println("La cadena no es vacía");
        }
    }

    public static boolean esVacia(String s) {
        return s.length() == 0;
    }
}
