package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        // Se ingresa por teclado un conjunto de valores numéricos enteros positivos, se
        // pide informar, por cada uno, si el valor ingresado es par o impar. Para
        // indicar el final se ingresará un valor cero o negativo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor númerico:");
        int valor = sc.nextInt();

        while (valor > 0) {
            if (valor % 2 == 0) {
                System.out.println("El número " + valor + " es par.");
            } else {
                System.out.println("El número " + valor + " es impar.");
            }
            System.out.println("Ingrese otro valor númerico:");
            valor = sc.nextInt();
        }

        sc.close();
    }
}
