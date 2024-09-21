package EjerciciosLOO;

public class Ejercicio_33 {
    public static void main(String[] args) {
        // Escribir una función que reciba dos matrices de NxN y devuelva la suma de las
        // mismas. Podemos considerar que las matrices se representan como un arreglo
        // bidimensional.

        int[][] matriz = {{1,2,3},{4,5,6}};

        System.out.println("La suma de la matriz es: " + sumaMatriz(matriz));
    }

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
