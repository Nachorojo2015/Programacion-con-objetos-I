package EjerciciosLOO;

public class Ejercicio_09 {
    public static void main(String[] args) {
        // Sumados: Sumar los 1000 primeros números naturales (1 + 2 + 3 + 4 + … +
        // 1000), imprimiendo por cada suma el resultado parcial obtenido.

        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            suma += i;
            System.out.println(suma);
        }

    }
}
