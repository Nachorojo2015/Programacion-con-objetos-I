package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        // Se ingresa por consola un número entero que representa un sueldo que se debe
        // pagar. Considerando que existen billetes de las denominaciones que se indican
        // más abajo; informar, que cantidad de billetes de cada denominación se deberá
        // utilizar, dando prioridad a los de valor nominal más alto. Denominaciones ($)
        // = {100, 50, 20, 10, 5, 2, 1}.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sueldo:");
        int sueldo = sc.nextInt();

        sc.close();

        int[] billetes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] contadorBilletes = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int suma = 0;
        int i = 0;

        while (sueldo != suma) {
            if (suma + billetes[i] > sueldo) {
                i++;
            } else {
                suma += billetes[i];
                contadorBilletes[i]++;
            }
        }

        for (int j = 0; j < contadorBilletes.length; j++) {
            System.out.println("Cantidad de billetes de " + billetes[i] + " utilizados: " + contadorBilletes[i]);
        }
    }
}
