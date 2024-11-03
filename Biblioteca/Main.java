package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1- Agregar libro");
            System.out.println("2- Registrar usuario");
            System.out.println("3- Prestar libro a un usuario");
            System.out.println("4- Devolver libro");
            System.out.println("5- Mostrar libros disponibles");
            System.out.println("6- Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String tituloLibro = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autorLibro = scanner.nextLine();
                    Libro libro = new Libro(tituloLibro, autorLibro);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del usuario:");
                    String nombreUsuario = scanner.nextLine();
                    System.out.println("Ingrese el ID del usuario:");
                    String idUsuario = scanner.nextLine();
                    Usuario usuario = new Usuario(nombreUsuario, idUsuario);
                    biblioteca.registrarUsuario(usuario);
                    break;

                case 3:
                    System.out.println("Ingrese el título del libro a prestar:");
                    tituloLibro = scanner.nextLine();
                    System.out.println("Ingrese el nombre del usuario que solicita el libro:");
                    nombreUsuario = scanner.nextLine();
                    Usuario usuarioSolicitante = biblioteca.obtenerUsuario(nombreUsuario);
                    if (usuarioSolicitante != null) {
                        biblioteca.prestarLibro(tituloLibro, usuarioSolicitante);
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el título del libro a devolver:");
                    tituloLibro = scanner.nextLine();
                    biblioteca.devolverLibro(tituloLibro);
                    break;

                case 5:
                    biblioteca.mostrarLibros();
                    break;

                case 6:
                    scanner.close();
                    return;

            }
        }
    }
}
