package EjerciciosLOO;

public class Ejercicio_31 {
    public static void main(String[] args) {
        // Escribir una función que reciba un arreglo de enteros y devuelva la suma de
        // los elementos que se encuentran en posiciones pares (incluido el elemento de
        // la posición 0). Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve
        // 22 (1+13+8)

        int[] numeros = { 1, 2, 13, 4, 8, 6 };

        System.out.println(sumarNumerosPosicionesPares(numeros));
    }

    public static int sumarNumerosPosicionesPares(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i += 2) {
            suma += numeros[i];
        }
        return suma;
    }
}
