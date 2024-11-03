package Biblioteca

import java.util.*


    fun main(args: Array<String>) {
        val biblioteca: Biblioteca = Biblioteca()

        while (true) {
            println("\n¿Qué desea hacer?")
            println("1- Agregar libro")
            println("2- Registrar usuario")
            println("3- Prestar libro a un usuario")
            println("4- Devolver libro")
            println("5- Mostrar libros disponibles")
            println("6- Salir")

            val opcion = readLine()!!.toInt()


            if (opcion == 1) {
                println("Ingrese el título del libro:")
                val tituloLibro = readLine()!!.toString()
                println("Ingrese el autor del libro:")
                val autorLibro =  readLine()!!.toString()
                val libro: Libro = Libro(tituloLibro, autorLibro)
                biblioteca.agregarLibro(libro)

            } else if (opcion == 2) {
                println("Ingrese el nombre del usuario:")
                val nombreUsuario = readLine()!!.toString()
                println("Ingrese el ID del usuario:")
                val idUsuario =  readLine()!!.toString()
                val usuario: Usuario = Usuario(nombreUsuario, idUsuario)
                biblioteca.registrarUsuario(usuario)

            } else if (opcion == 3) {
                println("Ingrese el título del libro a prestar:")
                val tituloLibro =  readLine()!!.toString()
                println("Ingrese el nombre del usuario que solicita el libro:")
                val nombreUsuario = readLine()!!.toString()
                val usuarioSolicitante: Usuario? = biblioteca.obtenerUsuario(nombreUsuario)
                if (usuarioSolicitante != null) {
                    biblioteca.prestarLibro(tituloLibro, usuarioSolicitante)
                } else {
                    println("Usuario no encontrado.")
                }

            } else if (opcion == 4) {
                println("Ingrese el título del libro a devolver:")
                val tituloLibro =  readLine()!!.toString()
                biblioteca.devolverLibro(tituloLibro)

            } else if (opcion == 5) {
                biblioteca.mostrarLibros()

            } else if (opcion == 6) {
                return
            }

        }
    }
