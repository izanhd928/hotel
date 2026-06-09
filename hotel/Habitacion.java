package hotel;
public class Habitacion {

   private String tipo;
   private int numero;
   private double precioNoche;
   private boolean ocupada;



    public String getTipo() {
    return tipo;
}

   public void setTipo(String tipo) {
    this.tipo = tipo;
   }

   public int getNumero() {
    return numero;
   }

   public void setNumero(int numero) {
    this.numero = numero;
   }

   public double getPrecioNoche() {
    return precioNoche;
   }

   public void setPrecioNoche(double precioNoche) {
    this.precioNoche = precioNoche;
   }

   public boolean isOcupada() {
    return ocupada;
   }

   public void setOcupada(boolean ocupada) {
    this.ocupada = ocupada;
   }

    public Habitacion(String t, int n, double p) {
        tipo = t;
        numero = n;
        precioNoche = p;
        ocupada = false;
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Número: " + numero);
        System.out.println("Precio por noche: " + precioNoche);
        System.out.println("Ocupada: " + ocupada);
    }

    public void reservar() {
        ocupada = true;
    }

    public void liberar() {
        ocupada = false;
    }

    public double calcularPrecioEstancia(int dias) {
        return precioNoche * dias;
    }
}