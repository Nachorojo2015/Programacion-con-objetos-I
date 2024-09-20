package EjerciciosLOO;

public class Ejercicio_11 {
    public static void main(String[] args) {
        // Escribir una función que calcule la suma de los múltiplos de 3 o 5, mayores o
        // iguales que 0 y menores que un parámetro n. Por ejemplo la llamada:

        // sumaMultiplos(10); <-- devuelve 23 (3+5+6+9)
        // sumaMultiplos(16); <-- devuelve 60 (3+5+6+9+10+12+15)

        sumaMultiplos(10);

        System.out.println("--------------");

        sumaMultiplos(16);
        
    }

    public static int sumaMultiplos(int n) {
        int suma = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                suma += i;
            }
        }

        return suma;
    }
}
