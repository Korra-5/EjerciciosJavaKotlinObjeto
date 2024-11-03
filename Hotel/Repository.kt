package org.example.Hotel

class Repository {
    private val habitaciones: MutableList<Habitacion> = mutableListOf()
    private val reservas: MutableList<Reservas> = mutableListOf()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
        println("Habitación ${habitacion.numero} añadida.")
    }

    fun reservarHabitacion(cliente: Cliente, numeroHabitacion: String): Boolean {
        val habitacion = habitaciones.find { it.numero == numeroHabitacion && it.disponible }
         if (habitacion != null) {
            val reserva = Reservas(cliente, habitacion)
            reservas.add(reserva)
            habitacion.disponible = false
            println("Reserva realizada para ${cliente.nombre} en la habitación ${habitacion.numero}.")
            return true
        } else {
            println("Error: Habitación no disponible.")
            return false
        }
    }

    fun cancelarReserva(numeroHabitacion: String) {
        val reserva = reservas.find { it.habitacion.numero == numeroHabitacion }
        if (reserva != null) {
            reservas.remove(reserva)
            reserva.habitacion.disponible = true
            println("Reserva cancelada para en la habitación ${numeroHabitacion}.")
        } else {
            println("No se encontró la reserva en la habitación ${numeroHabitacion}.")
        }
    }

    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
        } else {
            println("Reservas activas:")
            for (numero in habitaciones) {
                println("Se ha reservado la habitación${numero.numero}.")
            }
        }
    }
}