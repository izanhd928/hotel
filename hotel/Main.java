package hotel;
public class Main {

    public static void main(String[] args) {

        CHabitacion habitacion1 = new Habitacion(
                "Doble",
                204,
                85.50);

        habitacion1.mostrarDatos();
        habitacion1.reservar();

        operativa_habitacion(habitacion1, 4);
    }

    private static void operativa_habitacion(CHabitacion habitacion1, int dias) {
        System.out.println("Precio estancia: "
                + habitacion1.calcularPrecioEstancia(3));

        habitacion1.liberar();
    }
}