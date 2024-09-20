package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        // Determinar el menor valor de un conjunto de números e indicar también su
        // posición relativa dentro del mismo. El ingreso de datos finaliza con la
        // llegada de un cero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int n = sc.nextInt();

        int i = 0;
        int menor = n;
        int menorPosicion = 0;

        while (n != 0) {
            if (n < menor) {
                menor = n;
                menorPosicion = i;
            }
            i++;
            System.out.println("Ingrese otro número:");
            n = sc.nextInt();
        }

        sc.close();

        System.out.println("El menor número ingresado fue: " + menor);
        System.out.println("Y su posicion relativa es: " + menorPosicion);
    }
}
