package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Leer dos valores enteros e informar la suma y su cociente

        Scanner ls = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int valorUno = ls.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int valorDos = ls.nextInt();

        ls.close();

        System.out.println("Suma: " + (valorUno + valorDos));
        System.out.println("Cociente: " + (valorUno / valorDos));
    }
}
