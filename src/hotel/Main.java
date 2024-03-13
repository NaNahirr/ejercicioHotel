package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws InputMismatchException, Exception{
        Hotel hotel = new Hotel();      
        try {
        System.out.println("----------------- AGREGO HABITACIONES SIMPLES------------------------");
        Habitacion simple = pedirDatos("Simple");
        hotel.agregarHabitacion(simple);
        
         System.out.println("-------------------------- AGREGO HABITACIONES DOBLES------------------------");
        Habitacion doble = pedirDatos("Doble");
        hotel.agregarHabitacion(doble);
        
        System.out.println("---------------------------- AGREGO HABITACIONES EN SUITE------------------------------");
        Habitacion suite = pedirDatos("Suite");
        hotel.agregarHabitacion(suite);
        
        System.out.println("----------------------- MUESTRO INFO DE CADA HABITACION CREADA------------------------");
        simple.mostrarInformacion();
            System.out.println("Categoria doble: ");
        doble.mostrarInformacion();
        System.out.println("Categoria Suite: ");
        suite.mostrarInformacion();

         System.out.println("----------------- ORDENAMIENTO POR PRECIO DE LAS HABITACIONES------------------------");
         hotel.ordenarPorPrecio();
         
         System.out.println("----------------- MUESTRO INFO DE LAS HABITACIONES AGREGADAS------------------------");
         hotel.mostratDisponibles();
                
        System.out.println("----------------- GENERO DESCUENTO HABITACIONES EN SUITE------------------------");
        ((Suite)suite).calcularDescuento(15);
         suite.mostrarInformacion();
        }catch (InputMismatchException x){
            System.out.println("Error en el tipo de datos ingresado "+ x);
        }catch(Exception e){
            System.out.println("Error general "+ e);
        }finally{
            System.out.println("El bloque finally");
        }
         }
    public static Habitacion pedirDatos(String tipo)  throws InputMismatchException, Exception{ //propagar execpciones
        Habitacion habitacion = null;
        Scanner leer = new Scanner(System.in);
        
        try {
        System.out.println("Ingresa el número de habitacion: ");
        int numeros = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresa precio de la habitacion: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingresa la capacidad de las personas por habitacion: ");
        int capacidad = leer.nextInt();
          leer.nextLine();
        switch (tipo) {
            
            case "Simple":
                System.out.println("Ingresa categoría de habitacion:");
                String categoria = leer.nextLine();
                habitacion = new HabitacionSimple(categoria, numeros, precio, capacidad);
                break;
            case "Doble":
                System.out.println("Ingresa tipo de vista de la habitación: ");
                String vista = leer.nextLine();
             //   leer.nextLine();
                habitacion = new HabitacionDoble(vista, numeros,  precio, capacidad);          
                break;
            case "Suite":
                System.out.println("Ingresa el servicio adicional de la habitación: ");
                String servicioAdicional = leer.nextLine();
                habitacion = new Suite(servicioAdicional, numeros,  precio, capacidad);
                break;             
            default:
                System.out.println("Por favor. Ingresa una opción válida. ");
                break;
        }
       } catch (InputMismatchException e ){
                System.out.println("Error de tipo " + e.fillInStackTrace() + " al ingresar datos incorrectos");
                } catch (Exception j){
                    System.out.println("Error general :" + j.fillInStackTrace());

        }finally {
            System.out.println("Bloque finally");
        }
        return habitacion;
    }

  }

