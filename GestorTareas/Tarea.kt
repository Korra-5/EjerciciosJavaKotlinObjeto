package org.example.GestorTareas


class Tarea
    (val nombre: String, val descripcion: String) {

    var isCompletada: Boolean = false

    fun marcarComoCompletada() {
        isCompletada = true
    }

    override fun toString(): String {
        return nombre + (if (isCompletada) " [Completada]" else " [Pendiente]")
    }
}