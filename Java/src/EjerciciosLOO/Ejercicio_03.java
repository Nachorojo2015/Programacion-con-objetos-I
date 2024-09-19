package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Dado un valor numérico entero, informar si es par o impar

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        sc.close();

        if (valor % 2 == 0) {
            System.out.println("El valor es par");
        } else {
            System.out.println("El valor es impar");
        }
    }
}
