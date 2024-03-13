
package hotel;

public class HabitacionDoble extends Habitacion {
    private String vista;

    public HabitacionDoble(String vista, int numeros, double precio, int capacidad) {
        super(numeros, precio, capacidad);
        this.vista = vista;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Vista: "+ vista);
    }

   
    
    
    
    
}
