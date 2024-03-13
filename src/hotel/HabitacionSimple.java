
package hotel;

public class HabitacionSimple extends Habitacion{
    private String categoria;

    public HabitacionSimple(String categoria, int numeros, double precio, int capacidad) {
        super(numeros, precio, capacidad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion() {
         super.mostrarInformacion(); 
        System.out.println("Categoria: "+ categoria );
    }
    
    
    
    
}
