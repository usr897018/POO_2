package corenetworks.modelo;

public class Vendedor extends Empleado{
    //Atributos

    private double ventas;
    private double comision;
    //Metodos

    @Override
    public double calcularNomina() {
         return ((sueldo +(ventas * comision)) * PORCENTAJE);
    }

    //Constructores

    public Vendedor() {
    }

    public Vendedor(double sueldo, String nDNI, String nombre, int idEmpleado, double ventas, double comision) {
        super(sueldo, nDNI, nombre, idEmpleado);
        this.ventas = ventas;
        this.comision = comision;
    }

//Setters y Getters

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public double getComision() {
        return comision;
    }
}
