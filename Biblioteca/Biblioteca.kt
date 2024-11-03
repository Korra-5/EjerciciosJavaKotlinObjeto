package Biblioteca

class Biblioteca {
    private val libros: MutableList<Biblioteca.Libro>
    private val usuarios: MutableList<Biblioteca.Usuario>

    init {
        this.libros = ArrayList<Biblioteca.Libro>()
        this.usuarios = ArrayList<Biblioteca.Usuario>()
    }

    fun agregarLibro(libro: Biblioteca.Libro) {
        libros.add(libro)
        println("Libro '" + libro.getTitulo() + "' añadido a la biblioteca.")
    }

    fun registrarUsuario(usuario: Biblioteca.Usuario) {
        usuarios.add(usuario)
        println("Usuario '" + usuario.getNombre() + "' registrado en la biblioteca.")
    }

    fun obtenerUsuario(nombreUsuario: String): Biblioteca.Usuario? {
        for (usuario in usuarios) {
            if (usuario.getNombre().equals(nombreUsuario, ignoreCase = true)) {
                return usuario
            }
        }
        println("No se encontró el usuario '$nombreUsuario'.")
        return null
    }

    fun prestarLibro(tituloLibro: String, usuario: Biblioteca.Usuario) {
        for (libro in libros) {
            if (libro.getTitulo().equals(tituloLibro, ignoreCase = true)) {
                if (libro.isPrestado()) {
                    println("El libro '$tituloLibro' ya está prestado.")
                } else {
                    libro.prestar()
                    println("El libro '" + tituloLibro + "' ha sido prestado a " + usuario.getNombre() + ".")
                }
                return
            }
        }
        println("El libro '$tituloLibro' no se encuentra en la biblioteca.")
    }

    fun devolverLibro(tituloLibro: String) {
        for (libro in libros) {
            if (libro.getTitulo().equals(tituloLibro, ignoreCase = true) && libro.isPrestado()) {
                libro.devolver()
                println("El libro '$tituloLibro' ha sido devuelto a la biblioteca.")
                return
            }
        }
        println("El libro '$tituloLibro' no se puede devolver porque no está prestado.")
    }

    fun mostrarLibros() {
        if (libros.isEmpty()) {
            println("No hay libros en la biblioteca.")
        } else {
            println("Libros en la biblioteca:")
            for (libro in libros) {
                println(libro.getTitulo() + " por " + libro.getAutor() + (if (libro.isPrestado()) " [Prestado]" else " [Disponible]"))
            }
        }
    }
}