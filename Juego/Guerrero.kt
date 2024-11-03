package Juego

class Guerrero(nombre: String?, puntosDeVida: Int, private val daño: Int) :
    Personaje(nombre!!, puntosDeVida) {
    override fun atacar(objetivo: Personaje?) {
        println(nombre + " ataca a " + objetivo.nombre + ".")
        objetivo.recibirDaño(daño)
    }
}