package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        // Desarrollar una función que muestre por pantalla los primeros n números
        // naturales considerando al 0 (cero) como primer número natural, siendo n un
        // valor que se pasa por parámetro.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
