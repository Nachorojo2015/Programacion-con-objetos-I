package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        // Invertir un string, sin usar la biblioteca que lo haga automáticamente

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        sc.close();

        String cadenaInvertida = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            cadenaInvertida += s.charAt(i);
        }

        System.out.println(cadenaInvertida);
    }
}
