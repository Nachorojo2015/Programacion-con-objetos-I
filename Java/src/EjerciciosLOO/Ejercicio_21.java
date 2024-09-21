package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        // Determinar si un carácter es una letra mayúscula o minúscula (función
        // esMayuscula(char c) y esMinuscula(char c)).

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese caracter:");
        char c = sc.next().charAt(0);

        sc.close();

        if (esMayuscula(c)) {
            System.out.println("El caracter es una letra mayúscula");
        }
        
        if (esMinuscula(c)) {
            System.out.println("El caracter es una letra minúscula");
        }
    }

    public static boolean esMayuscula(char c) {
        return Character.toUpperCase(c) == c;
    }

    public static boolean esMinuscula(char c) {
        return !esMayuscula(c);
    }
}
