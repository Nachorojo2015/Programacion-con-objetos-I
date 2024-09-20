package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        // Se ingresa un valor numérico por consola, determinar e informar si se trata
        // de un número primo o no

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor númerico");
        int valor = sc.nextInt();

        sc.close();

        boolean primo = true;

        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) primo = false;
        }

        if (primo) {
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }

    }
}
