package org.example.GestorTareas



class Usuario(val nombre: String) {
    private val proyectos: MutableList<Proyecto>

    init {
        this.proyectos = ArrayList<Proyecto>()
    }

    fun crearProyecto(nombreProyecto: String) {
        val nuevoProyecto: Proyecto = Proyecto(nombreProyecto)
        proyectos.add(nuevoProyecto)
        println("Proyecto '$nombreProyecto' creado.")
    }

    fun obtenerProyecto(nombreProyecto: String): Proyecto? {
        for (proyecto in proyectos) {
            if (proyecto.nombre==nombreProyecto) {
                return proyecto
            }
        }
        println("No se encontró el proyecto $nombreProyecto.")
        return null
    }
}