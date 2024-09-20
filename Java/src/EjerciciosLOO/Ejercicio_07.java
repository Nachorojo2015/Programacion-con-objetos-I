package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        // Leer un valor numérico que representa un día de la semana. Se pide mostrar
        // por pantalla el nombre del día considerando que el lunes es el día 1, el
        // martes es el día 2 y así, sucesivamente

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número de día:");
        int dia = sc.nextInt();

        sc.close();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miércoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        }
    }
}
