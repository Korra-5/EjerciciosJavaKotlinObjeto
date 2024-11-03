package Juego;

public class Guerrero extends Personaje {
    private int daño;

    public Guerrero(String nombre, int puntosDeVida, int daño) {
        super(nombre, puntosDeVida);
        this.daño = daño;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + ".");
        objetivo.recibirDaño(daño);
    }
}
