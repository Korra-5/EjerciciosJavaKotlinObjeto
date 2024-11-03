package GestionEstudiantes;

public class Curso {
    private String nombre;
    private String id;


    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.id = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}