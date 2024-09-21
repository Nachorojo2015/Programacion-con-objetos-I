package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        // Escribir una función que reciba un string y lo devuelva invertido. Por
        // ejemplo: invertirCadena("Hola"),retorna "aloH". Reutilice la función
        // implementada para decir si una palabra es o no, un palíndromo.
        // esPalindromo("neuquen") devuelve true

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String s = sc.nextLine();

        sc.close();

        if (esPalindromo(s)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }

    public static String invertirCadena(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    } 

    public static boolean esPalindromo(String s) {
        String invertida = invertirCadena(s);
        return s.equals(invertida);
    }
}
