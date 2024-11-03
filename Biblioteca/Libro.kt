package Biblioteca


class Libro(val titulo: String, val autor: String) {
    var isPrestado: Boolean = false

    fun prestar() {
        isPrestado = true
    }

    fun devolver() {
        isPrestado = false
    }
}