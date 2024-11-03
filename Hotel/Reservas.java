package Hotel;

public class Reservas {
    private Cliente cliente;
    private Habitacion habitacion;

    public Reservas(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
}

