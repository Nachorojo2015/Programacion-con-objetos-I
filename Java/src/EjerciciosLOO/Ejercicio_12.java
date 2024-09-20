package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        // Dado un conjunto de valores numéricos que se ingresan por teclado determinar
        // el valor promedio. El fin de datos se indicará ingresando un valor igual a
        // cero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor númerico:");
        int valor = sc.nextInt();

        int contador = 0;
        int suma = 0;

        while (valor != 0) {
            suma += valor;
            contador++;
            System.out.println("Ingrese otro valor númerico:");
            valor = sc.nextInt();
        }

        sc.close();

        System.out.println("El promedio es: " + suma / contador);
    }
}
