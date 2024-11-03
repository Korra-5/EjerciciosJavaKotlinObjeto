package Juego


abstract class Personaje(val nombre: String, var puntosDeVida: Int) {
    fun recibirDaño(daño: Int) {
        puntosDeVida -= daño
        if (puntosDeVida < 0) {
            puntosDeVida = 0 // No se permiten puntos de vida negativos
        }
        println("$nombre ha recibido $daño puntos de daño. Vida restante: $puntosDeVida")
    }

    abstract fun atacar(objetivo: Personaje?)
}