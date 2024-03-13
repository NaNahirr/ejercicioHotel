
package hotel;

final public class Suite extends Habitacion implements Oferta{
    private String servicioAdicional;

    public Suite(String servicioAdicional, int numeros, double precio, int capacidad) {
        super(numeros, precio, capacidad);
        this.servicioAdicional = servicioAdicional;
    }

    public String getServicioAdicional() {
        return servicioAdicional;
    }

    public void setServicioAdicional(String servicioAdicional) {
        this.servicioAdicional = servicioAdicional;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Servicio adicional?: "+ servicioAdicional);
    }

    @Override
    public void calcularDescuento(int porcentaje) { 
       precio = precio - (precio * porcentaje/100);
//       Integer redondeo = Integer.valueOf(precio.intValue());
        Integer redondeo = (int)(double) precio;
        System.out.println("Precio de la haibtacion en suite con el :" + porcentaje + "% de descuento es de:"+ redondeo);
    }

    
}
