package Juego

import java.util.*



    fun main(args: Array<String>) {

        val guerrero = Guerrero("Guerrero", 100, 20)
        val mago = Mago("Mago", 80, 50)

        val fuego = Hechizo("Fuego", 25, 10)

        while (guerrero.puntosDeVida > 0 && mago.puntosDeVida > 0) {
            println("\nTurno del Guerrero:")
            guerrero.atacar(mago)

            if (mago.puntosDeVida > 0) {
                println("\nTurno del Mago:")
                mago.atacar(guerrero)
            }

            if (guerrero.puntosDeVida > 0 && mago.puntosDeVida > 0) {
                println("\nEl Mago lanza un hechizo de fuego.")
                mago.lanzarHechizo(fuego, guerrero)
            }
        }

        if (guerrero.puntosDeVida <= 0) {
            println("El guerrero ha sido derrotado.")
        } else {
            println("El mago ha sido derrotado.")
        }

    }
