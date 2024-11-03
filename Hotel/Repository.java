package Hotel;


import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Reservas> reservas = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitación " + habitacion.getNumero() + " añadida.");
    }

    public boolean reservarHabitacion(Cliente cliente, String numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero().equals(numeroHabitacion) && habitacion.isDisponible()) {
                Reservas reserva = new Reservas(cliente, habitacion);
                reservas.add(reserva);
                habitacion.setDisponible(false);
                System.out.println("Reserva realizada para " + cliente.getNombre() + " en la habitación " + habitacion.getNumero() + ".");
                return true;
            }
        }
        System.out.println("Error: Habitación no disponible.");
        return false;
    }

    public void cancelarReserva(String numeroHabitacion) {
        Reservas reserva = null;
        for (Reservas r : reservas) {
            if (r.getHabitacion().getNumero().equals(numeroHabitacion)) {
                reserva = r;
                break;
            }
        }
        if (reserva != null) {
            reservas.remove(reserva);
            reserva.getHabitacion().setDisponible(true);
            System.out.println("Reserva cancelada para en la habitación " + numeroHabitacion + ".");
        } else {
            System.out.println("No se encontró la reserva en la habitación " + numeroHabitacion + ".");
        }
    }

    public void mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas.");
        } else {
            System.out.println("Reservas activas:");
            for (Reservas reserva : reservas) {
                System.out.println("Se ha reservado la habitación " + reserva.getHabitacion().getNumero() + ".");
            }
        }
    }
}
