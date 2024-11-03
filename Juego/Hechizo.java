package Juego;

public class Hechizo {
    private String nombre;
    private int daño;
    private int costoMana;

    public Hechizo(String nombre, int daño, int costoMana) {
        this.nombre = nombre;
        this.daño = daño;
        this.costoMana = costoMana;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    public int getCostoMana() {
        return costoMana;
    }
}
