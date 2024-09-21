package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        // Determinar si un carácter es una letra (función esLetra(char c))

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un caracter:");
        char c = sc.next().charAt(0);

        sc.close();

        if (esLetra(c)) {
            System.out.println("Es una letra");
        } else {
            System.out.println("No es una letra");
        }
    }

    public static boolean esLetra(char c) {
        return Character.toUpperCase(c) != Character.toLowerCase(c);
    }
}
