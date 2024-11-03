package GestorTareas;

import GestorTareas.Tarea;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea " + tarea.getNombre() + " añadida al proyecto " + nombre + ".");
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en el proyecto " + nombre + ".");
        } else {
            System.out.println("Tareas en el proyecto " + nombre + ":");
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }

    public void marcarTareaComoCompletada(String nombreTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombreTarea)) {
                tarea.marcarComoCompletada();
                System.out.println("Tarea " + nombreTarea + " marcada como completada.");
                return;
            }
        }
        System.out.println("No se encontró la tarea " + nombreTarea + " en el proyecto.");
    }
}
