package org.example.GestionEstudiantes

class Estudiante(val nombre: String) {
    private val calificaciones: MutableList<Double> = ArrayList()

    fun agregarCalificacion(calificacion: Double) {
        calificaciones.add(calificacion)
    }

    fun calcularPromedio(): Double {
        if (calificaciones.isEmpty()) {
            return 0.0
        }
        var suma = 0.0
        for (calificacion in calificaciones) {
            suma += calificacion
        }
        return suma / calificaciones.size
    }
}
