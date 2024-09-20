package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        // Desarrollar un algoritmo que muestre los primeros n números primos siendo n
        // un valor que debe ingresar el usuario.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número:");
        int n = sc.nextInt();

        sc.close();

        System.out.println("-------------");

        int i = 0;

        int numero = 2;

        while (i != n) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                i++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
