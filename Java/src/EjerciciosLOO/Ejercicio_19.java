package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        // Determinar si un carácter es un dígito numérico (función esDigito(char c)).

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un caracter:");
        char caracter = sc.next().charAt(0);

        sc.close();

        if (esDigito(caracter)) {
            System.out.println("Es un dígito");
        } else {
            System.out.println("No es un dígito");
        }
    }

    public static boolean esDigito(char c) {
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }
}
