package org.example.GestorTareas

import java.util.*


    fun main(args: Array<String>) {

        println("Ingrese el nombre del usuario:")
        val nombreUsuario =readLine()!!.toString()
        val usuario: Usuario = Usuario(nombreUsuario)

        while (true) {
            println("\n¿Qué desea hacer?")
            println("1- Crear un proyecto")
            println("2- Añadir tarea a un proyecto")
            println("3- Marcar tarea como completada")
            println("4- Mostrar tareas de un proyecto")
            println("5- Salir")

            val opcion =readLine()!!.toInt()

            if (opcion == 1) {
                    println("Ingrese el nombre del proyecto:")
                    val nombreProyecto =readLine()!!.toString()
                    usuario.crearProyecto(nombreProyecto)


        }else if (opcion==2) {
                    println("Ingrese el nombre del proyecto:")
                val nombreProyecto =readLine()!!.toString()
                    val proyecto: Proyecto? = usuario.obtenerProyecto(nombreProyecto)
                    if (proyecto != null) {
                        println("Ingrese el nombre de la tarea:")
                        val nombreTarea =readLine()!!.toString()
                        println("Ingrese la descripción de la tarea:")
                        val descripcionTarea =readLine()!!.toString()
                        val tarea: Tarea =Tarea(nombreTarea, descripcionTarea)
                        proyecto.añadirTarea(tarea)
                    }
                }else if (opcion==3) {
                    println("Ingrese el nombre del proyecto:")
                val nombreProyecto =readLine()!!.toString()
                val proyecto = usuario.obtenerProyecto(nombreProyecto)
                    if (proyecto != null) {
                        println("Ingrese el nombre de la tarea a marcar como completada:")
                        val nombreTarea =readLine()!!.toString()
                        proyecto.marcarTareaComoCompletada(nombreTarea)
                    }
                }else if (opcion==4) {
                    println("Ingrese el nombre del proyecto:")
                val nombreProyecto =readLine()!!.toString()
                    val proyecto = usuario.obtenerProyecto(nombreProyecto)
                    if (proyecto != null) {
                        proyecto.mostrarTareas();
                    }
                }else if (opcion==5) {

                    break
                }
         }
        }

