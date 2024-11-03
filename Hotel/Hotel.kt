package org.example.Hotel

import org.example.Hotel.Repository

val repository: Repository = Repository()
fun main(args: Array<String>) {
while (true) {
    println("Que deseas hacer")
    println("1- Añadir habitacion")
    println("2- Reservar habitacion")
    println("3- Cancelar reserva")
    println("4- Mostrar reservas")
    println("5- Salir")

    val opcion=readLine()!!.toInt()
    if (opcion==1){
        println("Añade numero de la habitacion")
        val numero=readLine()!!.toString()
        repository.agregarHabitacion(Habitacion(numero))
    } else if (opcion==2){
        println("Inserte su nombre")
        val nombre=readLine()!!.toString()

        println("Inserte su DNI")
        val dni=readLine()!!.toString()

        println("Inserte hsbitacion")
        val habitacion=readLine()!!.toString()

        repository.reservarHabitacion(Cliente(nombre, dni), habitacion)
    } else if (opcion==3){
        println("Inserte numero de habitacion para cancelar la reserva")
        val numero=readLine()!!.toString()
        repository.cancelarReserva(numero)
    }else if (opcion==4){
        repository.mostrarReservasActivas()
    }else if (opcion==5){
        break
    }
}
}