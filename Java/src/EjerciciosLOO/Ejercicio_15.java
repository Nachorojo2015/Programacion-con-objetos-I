package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        // Dado un conjunto de valores numéricos indicar cuál es el mayor. El ingreso de
        // datos finaliza con la llegada de un cero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int n = sc.nextInt();

        int mayor = 0;

        while (n != 0) {
            if (n > mayor) {
                mayor = n;
            }

            System.out.println("Ingrese otro número:");
            n = sc.nextInt();
        }

        sc.close();

        System.out.println("El mayor número ingresado fue: " + mayor);
    
    }
}
