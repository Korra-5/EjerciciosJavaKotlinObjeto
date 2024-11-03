package org.example.GestionEstudiantes


class Profesor(val nombre: String) {
    fun asignarCurso(estudiante: Estudiante, curso:Curso, calificacion: Double) {
        estudiante.agregarCalificacion(calificacion)
        println(
            "Has asignado el curso " + curso.nombre +
                    " al estudiante " + estudiante.nombre + " con calificación " + calificacion
        )
    }
}