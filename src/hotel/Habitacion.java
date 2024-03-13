package hotel;

/**
 *
 * @author usuario01
 */
public abstract class Habitacion {

    protected int numeros;
    protected Double precio;
    protected int capacidad;
    protected boolean reservada;

    public Habitacion(int numeros, Double precio, int capacidad) {
        this.numeros = numeros;
        this.precio = precio;
        this.capacidad = capacidad;
        this.reservada = false;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
    
    public void mostrarInformacion(){
        System.out.println("\n Información de la habitación ingresada");
        System.out.println("Número de habitación: "+ numeros);
        System.out.println("Precio: "+ precio);
        System.out.println("Capacidad de personas: "+ capacidad);
        System.out.println("Está reservada? :"+ reservada);
    };

}
