package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        Direccion direccionJuan = new Direccion("Av. Siempre Viva", "123", "Macul");
        Persona juan = new Persona("Juan", "Perez", 32, direccionJuan);
        Empleado empleadoJuan = new Empleado(juan, 5000,  "Contabilidad","Gerente" );

        Direccion direccionManuel = new Direccion("Av. Bellavista", "0288", "Providencia");
        Persona manuel = new Persona("Manuel", "Gonzales", 25, direccionManuel);
        Empleado empleadoManuel = new Empleado(manuel, 4000,  "Ventas", "Asistente");

        Direccion direccionAna = new Direccion("Av. Salvador", "2346", "Santiago");
        Persona ana = new Persona("Ana", "Silva", 40, direccionAna);
        Empleado empleadoAna = new Empleado(ana, 8000,  "Estadistica", "Analista");

        System.out.println(empleadoJuan.toString());
        System.out.println("#####################");
        System.out.println(empleadoManuel.toString());
        System.out.println("#####################");
        System.out.println(empleadoAna.toString());

    }
}
