package hotel;
public class Main {

    public static void main(String[] args) {

        Habitacion habitacion1 = new Habitacion(
                "Doble",
                204,
                85.50);

        habitacion1.mostrarDatos();
        habitacion1.reservar();

        operativa_habitacion(habitacion1, 4);
    }

    private static void operativa_habitacion(Habitacion habitacion1, int dias) {
        System.out.println("Precio estancia: "
                + habitacion1.calcularPrecioEstancia(dias));

        habitacion1.liberar();
    }
}