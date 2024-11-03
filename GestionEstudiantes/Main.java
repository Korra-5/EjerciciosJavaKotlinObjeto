package GestionEstudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estudiante estudiante1 = new Estudiante("Estudiante 1");
        Estudiante estudiante2 = new Estudiante("Estudiante 2");
        Profesor profesor = new Profesor("Profesor");
        Curso curso1 = new Curso("Programacion", "101");

        while (true) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1- Asignar calificación a un estudiante");
            System.out.println("2- Calcular promedio de un estudiante");
            System.out.println("3- Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Inserte el nombre del estudiante:");
                    String nombreEstudiante = scanner.nextLine();
                    if (nombreEstudiante.equals(estudiante1.getNombre())) {
                        System.out.println("Inserte la calificación:");
                        double calificacion = scanner.nextDouble();
                        profesor.asignarCurso(estudiante1, curso1, calificacion);
                    } else if (nombreEstudiante.equals(estudiante2.getNombre())) {
                        System.out.println("Inserte la calificación:");
                        double calificacion = scanner.nextDouble();
                        profesor.asignarCurso(estudiante2, curso1, calificacion);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("Inserte el nombre del estudiante:");
                    nombreEstudiante = scanner.nextLine();
                    if (nombreEstudiante.equals(estudiante1.getNombre())) {
                        System.out.println("Promedio de " + estudiante1.getNombre() + ": " + estudiante1.calcularPromedio());
                    } else if (nombreEstudiante.equals(estudiante2.getNombre())) {
                        System.out.println("Promedio de " + estudiante2.getNombre() + ": " + estudiante2.calcularPromedio());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    scanner.close();
                    return;

            }
        }
    }
}