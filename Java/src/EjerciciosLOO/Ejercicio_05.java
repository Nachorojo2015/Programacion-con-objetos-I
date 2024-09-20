package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Leer dos valores numéricos enteros e indicar cual es el mayor y cual es el
        // menor. Considerar que ambos valores son diferentes

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer valor:");
        int valorUno = sc.nextInt();
        System.out.println("Ingrese segundo valor:");
        int valorDos = sc.nextInt();

        sc.close();

        if (valorUno == valorDos) {
            System.out.println("Los valores ingresados son iguales");
        } else {
            if (valorUno > valorDos) {
                System.out.println("El valor mayor es: " + valorUno);
            } else {
                System.out.println("El valor mayor es: " + valorDos);
            }
        }
    }
}
