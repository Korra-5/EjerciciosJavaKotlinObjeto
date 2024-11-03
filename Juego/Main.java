package Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Guerrero guerrero = new Guerrero("Guerrero", 100, 20);
        Mago mago = new Mago("Mago", 80, 50);

        Hechizo fuego = new Hechizo("Fuego", 25, 10);

        while (guerrero.getPuntosDeVida() > 0 && mago.getPuntosDeVida() > 0) {
            System.out.println("\nTurno del Guerrero:");
            guerrero.atacar(mago);

            if (mago.getPuntosDeVida() > 0) {
                System.out.println("\nTurno del Mago:");
                mago.atacar(guerrero);
            }

            if (guerrero.getPuntosDeVida() > 0 && mago.getPuntosDeVida() > 0) {
                System.out.println("\nEl Mago lanza un hechizo de fuego.");
                mago.lanzarHechizo(fuego, guerrero);
            }
        }

        if (guerrero.getPuntosDeVida() <= 0) {
            System.out.println("El guerrero ha sido derrotado.");
        } else {
            System.out.println("El mago ha sido derrotado.");
        }

        scanner.close();
    }
}
