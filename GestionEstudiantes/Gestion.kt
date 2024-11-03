package org.example.GestionEstudiantes

import java.util.*


    fun main(args: Array<String>) {

        val estudiante1: Estudiante = Estudiante("Estudiante 1")
        val estudiante2: Estudiante = Estudiante("Estudiante 2")
        val profesor: Profesor = Profesor("Profesor")
        val curso1: Curso = Curso("Programacion", "101")

        while (true) {
            println("¿Qué deseas hacer?")
            println("1- Asignar calificación a un estudiante")
            println("2- Calcular promedio de un estudiante")
            println("3- Salir")

            val opcion = readLine()!!.toInt()

            if (opcion == 1) {
                    println("Inserte el nombre del estudiante:")
                    val nombreEstudiante = readLine()!!.toString()
                    if (nombreEstudiante == estudiante1.nombre) {
                        println("Inserte la calificación:")
                        val calificacion =readLine()!!.toDouble()
                        profesor.asignarCurso(estudiante1, curso1, calificacion)
                    } else if (nombreEstudiante == estudiante2.nombre) {
                        println("Inserte la calificación:")
                        val calificacion=readLine()!!.toDouble()
                        profesor.asignarCurso(estudiante2, curso1, calificacion)
                    } else {
                        println("Estudiante no encontrado.")
                    }
                }

                else if (opcion == 2) {
                    println("Inserte el nombre del estudiante:")
                    val nombreEstudiante = readLine()!!.toString()
                    if (nombreEstudiante == estudiante1.nombre) {
                        println("Promedio de " + estudiante1.nombre + ": " + estudiante1.calcularPromedio())
                    } else if (nombreEstudiante == estudiante2.nombre) {
                        println("Promedio de " + estudiante2.nombre + ": " + estudiante2.calcularPromedio())
                    } else {
                        println("Estudiante no encontrado.")
                    }
                }

                else if (opcion == 3) {
                    break
                }
            }
        }
