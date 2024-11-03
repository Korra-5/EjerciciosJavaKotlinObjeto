package GestionEstudiantes;


public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso, double calificacion) {
        estudiante.agregarCalificacion(calificacion);
        System.out.println("Has asignado el curso " + curso.getNombre() +
                " al estudiante " + estudiante.getNombre() + " con calificación " + calificacion);
    }
}
