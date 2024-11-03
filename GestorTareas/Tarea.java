package GestorTareas;

public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completada;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, las tareas no están completadas
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public String toString() {
        return nombre + (completada ? " [Completada]" : " [Pendiente]");
    }
}
