package hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hotel {

    ArrayList<Habitacion> disponibles = new ArrayList<>();

    public Hotel() {
    }

    public ArrayList<Habitacion> getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(ArrayList<Habitacion> disponibles) {
        this.disponibles = disponibles;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        disponibles.add(habitacion);
    }

    public void mostratDisponibles() {
        for (Habitacion disponible : disponibles) {
            disponible.mostrarInformacion();
        }
    }

    public void ordenarPorPrecio() {
        Collections.sort(disponibles, new Comparator<Habitacion>() {
            public int compare(Habitacion hab1, Habitacion hab2) {
                return Double.compare(hab1.getPrecio(), hab2.getPrecio());
            }
        });
        for (Habitacion habitacion : disponibles) {
            habitacion.mostrarInformacion();
        }
    }

}
