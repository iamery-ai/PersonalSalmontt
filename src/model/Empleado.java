package model;
/**
 * Representa un empleado compuesto de una persona, salario y departamento.
 * @author Ian Mery
 * @version 1.0
 * **/
public class Empleado extends Persona{
    private double salario;
    private String departamento;
    private String cargo;
    /**
     * constructor que inicializa los datos de un empleado.
     * @param persona
     * @param salario
     * @param departamento
     * @param cargo
     * **/
    public Empleado(Persona persona, double salario, String departamento, String cargo) {
        super(persona.getNombre(), persona.getApellido(), persona.getEdad(),
                persona.getDireccion());
        this.salario = salario;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * retorna una representacion en String del empleado.
     * @return la descripcion del empleado como String.
     */
    @Override
    public String toString() {
        return super.toString() +"\n" +
                "Salario:" + salario + "\n" +
                "Departamento:" + departamento + "\n" +
                "Cargo:" + cargo;
    }
}
