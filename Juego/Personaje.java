package Juego;

public abstract class Personaje {
    private String nombre;
    private int puntosDeVida;

    public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) {
            puntosDeVida = 0; // No se permiten puntos de vida negativos
        }
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Vida restante: " + puntosDeVida);
    }

    public abstract void atacar(Personaje objetivo);
}
