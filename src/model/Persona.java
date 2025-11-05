package model;
/**
 * Representa una persona compuesta de nombre, apellido, edad y direccion.
 * @author Ian Mery
 * @version 1.0
 * **/
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;
    /**
     * constructor que inicializa los datos de una persona.
     * @param nombre
     * @param apellido
     * @param edad
     * @param direccion
     * **/
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    /**
     * retorna una representacion en String de la persona.
     * @return la descripcion de la persona como String.
     */
    @Override
    public String toString() {
        return "Nombre:" + nombre + "\n" +
                "Apellido:" + apellido + "\n" +
                "Edad:" + edad + "\n" +
                "Direccion:" + direccion;
    }
}
