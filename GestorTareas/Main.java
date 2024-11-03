package GestorTareas;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario);

        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1- Crear un proyecto");
            System.out.println("2- Añadir tarea a un proyecto");
            System.out.println("3- Marcar tarea como completada");
            System.out.println("4- Mostrar tareas de un proyecto");
            System.out.println("5- Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del proyecto:");
                    String nombreProyecto = scanner.nextLine();
                    usuario.crearProyecto(nombreProyecto);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del proyecto:");
                    nombreProyecto = scanner.nextLine();
                    Proyecto proyecto = usuario.obtenerProyecto(nombreProyecto);
                    if (proyecto != null) {
                        System.out.println("Ingrese el nombre de la tarea:");
                        String nombreTarea = scanner.nextLine();
                        System.out.println("Ingrese la descripción de la tarea:");
                        String descripcionTarea = scanner.nextLine();
                        Tarea tarea = new Tarea(nombreTarea, descripcionTarea);
                        proyecto.añadirTarea(tarea);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del proyecto:");
                    nombreProyecto = scanner.nextLine();
                    proyecto = usuario.obtenerProyecto(nombreProyecto);
                    if (proyecto != null) {
                        System.out.println("Ingrese el nombre de la tarea a marcar como completada:");
                        String nombreTarea = scanner.nextLine();
                        proyecto.marcarTareaComoCompletada(nombreTarea);
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del proyecto:");
                    nombreProyecto = scanner.nextLine();
                    proyecto = usuario.obtenerProyecto(nombreProyecto);
                    if (proyecto != null) {
                        proyecto.mostrarTareas();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del gestor de tareas...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
