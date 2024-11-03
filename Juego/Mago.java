package Juego;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int puntosDeVida, int mana) {
        super(nombre, puntosDeVida);
        this.mana = mana;
    }

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (mana >= hechizo.getCostoMana()) {
            mana -= hechizo.getCostoMana();
            System.out.println(getNombre() + " lanza el hechizo " + hechizo.getNombre() + " contra " + objetivo.getNombre() + ".");
            objetivo.recibirDaño(hechizo.getDaño());
        } else {
            System.out.println(getNombre() + " no tiene suficiente maná para lanzar " + hechizo.getNombre() + ".");
        }
    }


    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " con un bastón.");
        objetivo.recibirDaño(5);
    }
}
