package EjerciciosLOO;

public class Ejercicio_30 {
    public static void main(String[] args) {
        // Escribir una función que reciba un arreglo de enteros y devuelva true si el
        // arreglo está ordenado de mayor a menor y false si está desordenado.

        int[] numeros = { 1, 2, 3, 4, 5 };

        if (estaOrdenado(numeros)) {
            System.out.println("Esta ordenado");
        } else {
            System.out.println("No esta ordenado");
        }

    }

    public static boolean estaOrdenado(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
