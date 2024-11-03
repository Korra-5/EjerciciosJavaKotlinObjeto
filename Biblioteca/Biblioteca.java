package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' añadido a la biblioteca.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario '" + usuario.getNombre() + "' registrado en la biblioteca.");
    }

    public Usuario obtenerUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombreUsuario)) {
                return usuario;
            }
        }
        System.out.println("No se encontró el usuario '" + nombreUsuario + "'.");
        return null;
    }

    public void prestarLibro(String tituloLibro, Usuario usuario) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                if (libro.isPrestado()) {
                    System.out.println("El libro '" + tituloLibro + "' ya está prestado.");
                } else {
                    libro.prestar();
                    System.out.println("El libro '" + tituloLibro + "' ha sido prestado a " + usuario.getNombre() + ".");
                }
                return;
            }
        }
        System.out.println("El libro '" + tituloLibro + "' no se encuentra en la biblioteca.");
    }

    public void devolverLibro(String tituloLibro) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro) && libro.isPrestado()) {
                libro.devolver();
                System.out.println("El libro '" + tituloLibro + "' ha sido devuelto a la biblioteca.");
                return;
            }
        }
        System.out.println("El libro '" + tituloLibro + "' no se puede devolver porque no está prestado.");
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro.getTitulo() + " por " + libro.getAutor() + (libro.isPrestado() ? " [Prestado]" : " [Disponible]"));
            }
        }
    }
}
