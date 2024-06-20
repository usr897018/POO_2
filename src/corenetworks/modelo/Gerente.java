package corenetworks.modelo;

public class Gerente extends Empleado{

    //Atributos

    private String departamento;
    private int numeroPersonasCargo;
    private double bono;

    //Metodos

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + bono;
    }


    //Constructores
    //Los contructores NO SE HEREDAN

    //SobreCarga
    public Gerente() {
    }

    public Gerente(double sueldo, String nDNI, String nombre, int idEmpleado, String departamento, int numeroPersonasCargo, double bono) {
        super(sueldo, nDNI, nombre, idEmpleado);
        this.departamento = departamento;
        this.numeroPersonasCargo = numeroPersonasCargo;
        this.bono = bono;
    }

    //Setters y Getters


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNumeroPersonasCargo(int numeroPersonasCargo) {
        this.numeroPersonasCargo = numeroPersonasCargo;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getNumeroPersonasCargo() {
        return numeroPersonasCargo;
    }

    public double getBono() {
        return bono;
    }
}
