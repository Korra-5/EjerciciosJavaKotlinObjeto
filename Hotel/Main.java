package Hotel;


import java.util.Scanner;

public class Main {
    private static final Repository repository = new Repository();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que deseas hacer");
            System.out.println("1- Añadir habitación");
            System.out.println("2- Reservar habitación");
            System.out.println("3- Cancelar reserva");
            System.out.println("4- Mostrar reservas");
            System.out.println("5- Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    System.out.println("Añade número de la habitación:");
                    String numero = scanner.nextLine();
                    repository.agregarHabitacion(new Habitacion(numero));
                    break;
                case 2:
                    System.out.println("Inserte su nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Inserte su DNI:");
                    String dni = scanner.nextLine();
                    System.out.println("Inserte habitación:");
                    String habitacion = scanner.nextLine();
                    repository.reservarHabitacion(new Cliente(nombre, dni), habitacion);
                    break;
                case 3:
                    System.out.println("Inserte número de habitación para cancelar la reserva:");
                    String numeroCancelar = scanner.nextLine();
                    repository.cancelarReserva(numeroCancelar);
                    break;
                case 4:
                    repository.mostrarReservasActivas();
                    break;
                case 5:
                    scanner.close();
                    return;

            }
        }
    }
}
