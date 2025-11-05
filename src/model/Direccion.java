package model;
/**
 * Representa una direccion compuesta de una calle, un numero y comuna.
 * @author Ian Mery
 * @version 1.0
 * **/
public class Direccion {
    private String calle;
    private String numero;
    private String comuna;
    /**
     * constructor que inicializa los datos de una direccion.
     * @param calle
     * @param numero
     * @param comuna
     * **/
    public Direccion(String calle, String numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    /**
     * retorna una representacion en String de la direccion.
     * @return la descripcion de la direccion como String.
     */
    @Override
    public String toString() {
        return calle + ", Numero:" + numero + ", Comuna:" + comuna;
    }
}
