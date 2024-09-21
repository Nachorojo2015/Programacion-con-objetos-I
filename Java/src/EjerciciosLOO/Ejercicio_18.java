package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        // Implementar una función que recibe dos enteros de 8 dígitos con el formato
        // aaaammdd, informar cuál de las dos es la anterior y cuál la posterior. Usar
        // lo aplicado en ejercicio anterior. 

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese fecha uno:");
        int fechaUno = sc.nextInt();
        System.out.println("Ingrese fecha dos:");
        int fechaDos = sc.nextInt();

        sc.close();

        if (Math.round(fechaUno / 10000) > Math.round(fechaDos / 10000)) {
            System.out.println(fechaUno + " es mayor que " + fechaDos);
        } else {
            if (Math.round(fechaUno / 10000) == Math.round(fechaDos / 10000)) {
                if (Math.round(fechaUno / 100) % 100 > Math.round(fechaDos / 100) % 100) {
                    System.out.println(fechaUno + " es mayor que " + fechaDos);
                } else {
                    if (Math.round(fechaUno / 100) % 100 == Math.round(fechaDos / 100) % 100) {
                        if (Math.round(fechaUno % 100) > Math.round(fechaDos % 100)) {
                            System.out.println(fechaUno + " es mayor que " + fechaDos);
                        } else {
                            System.out.println(fechaDos + " es mayor que " + fechaUno);
                        }
                    } else {
                        System.out.println(fechaDos + " es mayor que " + fechaUno);
                    }
                }
            } else {
                System.out.println(fechaDos + " es mayor que " + fechaUno);
            }
        }
    }
}
