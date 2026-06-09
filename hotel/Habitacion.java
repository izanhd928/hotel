package hotel;
public class Habitacion {

   private String tipo;
   private int numero;
   private double precioNoche;
   private boolean ocupada;



/**
 * @param tipo 
 * @param numero 
 * @param precioNoche 
 * @param ocupada 
 * @return 
 */

    public String getTipo() {
    return tipo;
}
/**
 * Establece el tipo de la habitación.
 * @param tipo El tipo de la habitación.
 */
   public void setTipo(String tipo) {
    this.tipo = tipo;
   }
/**
 * Obtiene el número de la habitación.
 * @return El número de la habitación.
 */
   public int getNumero() {
    return numero;
   }

   public void setNumero(int numero) {
    this.numero = numero;
   }
/**
 * Obtiene el precio por noche de la habitación.
 * @return El precio por noche de la habitación.
 */
   public double getPrecioNoche() {
    return precioNoche;
   }

   public void setPrecioNoche(double precioNoche) {
    this.precioNoche = precioNoche;
   }
   /**
    * Indica si la habitación está ocupada.
    * @return true si la habitación está ocupada, false en caso contrario.
    */
 public boolean isOcupada() {
    return ocupada;
   }

   public void setOcupada(boolean ocupada) {
    this.ocupada = ocupada;
   }
/**
 * Constructor de la clase Habitacion.
 * @param t El tipo de la habitación.
 * @param n El número de la habitación.
 * @param p El precio por noche de la habitación.
 */
    public Habitacion(String t, int n, double p) {
        tipo = t;
        numero = n;
        precioNoche = p;
        ocupada = false;
    }
/**
 * Muestra los datos de la habitación.
 */
    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Número: " + numero);
        System.out.println("Precio por noche: " + precioNoche);
        System.out.println("Ocupada: " + ocupada);
    }
/**
 * Reserva la habitación.
 */
    public void reservar() {
        ocupada = true;
    }
/**
 * Libera la habitación.
 */
    public void liberar() {
        ocupada = false;
    }
/**
 * Calcula el precio total de la estancia en función del número de días.
 * @param dias El número de días de la estancia.
 * @return El precio total de la estancia.
 */
    public double calcularPrecioEstancia(int dias) {
        return precioNoche * dias;
    }
}