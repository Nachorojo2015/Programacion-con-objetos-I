package EjerciciosLOO;

import java.util.Scanner;

public class Ejercicio_29 {
    public static void main(String[] args) {
        // Se tiene una tabla o planilla con los resultados de la última llamada a
        // examen de una materia, con la siguiente información:

        // Matricula (valor numérico entero de 8 dígitos)
        // Nota (valor numérico entero de 2 dígitos entre 1 y 10)
        // Nombre (valor alfanumérico de 10 caracteres)
        // Se pide informar:
        // Cantidad de alumnos que se presentaron a rendir examen
        // Nota promedio
        // Nombre y nota del alumno que obtuvo el mejor resultado (será único)
        // Para indicar el fin del ingreso de datos el operador ingresará un registro
        // nulo con matrícula =0, nota=0 y nombre=""

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del alumno:");
        String nombre = sc.next();
        System.out.println("Ingrese matricula del alumno:");
        int matricula = sc.nextInt();
        System.out.println("Ingrese nota del alumno:");
        int nota = sc.nextInt();

        int cantidadAlumnos = 0;
        int sumaNotas = 0;

        String nombreMejorNota = "";
        int mejorNota = 0;

        while (matricula != 0 && nota != 0 && nombre.length() != 0) {
            cantidadAlumnos++;
            sumaNotas += nota;
            if (nota > mejorNota) {
                mejorNota = nota;
                nombreMejorNota = nombre;
            }
            System.out.println("Ingrese nombre del alumno:");
            nombre = sc.next();
            System.out.println("Ingrese matricula del alumno:");
            matricula = sc.nextInt();
            System.out.println("Ingrese nota del alumno:");
            nota = sc.nextInt();
        }

        sc.close();

        System.out.println("Al examen se presentaron: " + cantidadAlumnos + " alumnos");
        System.out.println("La nota promedio fue: " + (sumaNotas / cantidadAlumnos));
        System.out.println(
                "El alumno que obtuvo la mejor nota fue: " + nombreMejorNota + ", con un resultado de: " + mejorNota);
    }
}
