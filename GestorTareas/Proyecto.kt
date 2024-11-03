package org.example.GestorTareas


class Proyecto(val nombre: String) {
    private val tareas: MutableList<Tarea>

    init {
        this.tareas = ArrayList<Tarea>()
    }

    fun añadirTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea " + tarea.nombre + " añadida al proyecto " + nombre + ".")
    }

    fun mostrarTareas() {
        if (tareas.isEmpty()) {
            println("No hay tareas en el proyecto $nombre.")
        } else {
            println("Tareas en el proyecto $nombre:")
            for (tarea in tareas) {
                println(tarea)
            }
        }
    }

    fun marcarTareaComoCompletada(nombreTarea: String) {
        for (tarea in tareas) {
            if (tarea.nombre == nombreTarea) {
                tarea.marcarComoCompletada()
                println("Tarea $nombreTarea marcada como completada.")
                return
            }
        }
        println("No se encontró la tarea $nombreTarea en el proyecto.")
    }
}