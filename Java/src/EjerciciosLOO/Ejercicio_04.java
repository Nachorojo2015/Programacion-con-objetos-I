package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Se ingresa un valor numérico de 8 dígitos que representa una fecha con el
        // siguiente formato aaaammdd. Se pide informar por separado el día, el mes y el
        // año de la fecha ingresada

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese fecha:");
        int fecha = sc.nextInt();

        sc.close();

        int año = Math.round(fecha / 10000);
        int mes = Math.round((fecha / 100) % 100);
        int dia = fecha % 100;

        System.out.println(año + "/" + mes + "/" + dia);
    }
}
