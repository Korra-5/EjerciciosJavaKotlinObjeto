package Juego

class Mago(nombre: String?, puntosDeVida: Int, private var mana: Int) : Personaje(nombre!!, puntosDeVida) {
    fun lanzarHechizo(hechizo: Hechizo, objetivo: Personaje) {
        if (mana >= hechizo.costoMana) {
            mana -= hechizo.costoMana
            println(nombre + " lanza el hechizo " + hechizo.nombre + " contra " + objetivo.nombre + ".")
            objetivo.recibirDaño(hechizo.daño)
        } else {
            println(nombre + " no tiene suficiente maná para lanzar " + hechizo.nombre + ".")
        }
    }


    override fun atacar(objetivo: Personaje?) {
        println(nombre + " ataca a " + objetivo?.nombre + " con un bastón.")
        objetivo?.recibirDaño(5)
    }
}