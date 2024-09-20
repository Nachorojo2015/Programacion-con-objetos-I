package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        // Leer tres valores numéricos enteros, indicar cual es el mayor, cuál es el del
        // medio y cuál el menor. Considerar que los tres valores son diferentes

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer valor:");
        int valorUno = sc.nextInt();
        System.out.println("Ingrese segundo valor:");
        int valorDos = sc.nextInt();
        System.out.println("Ingrese tercer valor:");
        int valorTres = sc.nextInt();

        sc.close();

        if (valorUno == valorDos && valorTres == valorUno) {
            System.out.println("Los tres valores son iguales");
        } else {
            if (valorDos > valorUno) {
                int aux = valorDos;
                valorDos = valorUno;
                valorUno = aux;
            }

            if (valorTres > valorDos) {
                int aux = valorTres;
                valorTres = valorDos;
                valorDos = aux;
            }
            
            if (valorDos > valorUno) {
                int aux = valorUno;
                valorUno = valorDos;
                valorDos = aux;
            }

            System.out.println("El valor mayor es: " + valorUno);
            System.out.println("El valor del medio es: " + valorDos);
            System.out.println("El valor menor es: " + valorTres);
        };
    }
}
