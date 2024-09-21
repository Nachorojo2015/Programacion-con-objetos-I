package EjerciciosLOO;

public class Ejercicio_32 {
    public static void main(String[] args) {
        // Implementar una función que reciba como parámetro un arreglo de enteros y
        // muestre por pantalla cuántas veces se repite cada uno. El arreglo no está
        // ordenado. Se garantiza que a los sumo habrá 100 números diferentes.

        int[] numeros = { 1, 2, 3, 4, 5, 6, 10, 8, 5, 2, 4, 1, 8, 12, 13, 67, 98, 32, 32 };

        mostrarNumerosRepetidos(numeros);
    }

    public static void mostrarNumerosRepetidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) contador++;
            }
            System.out.println("El número " + numeros[i] + " se repite " + contador + " veces");
        }
    }
}
