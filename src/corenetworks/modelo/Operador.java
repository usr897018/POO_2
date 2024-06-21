package corenetworks.modelo;

public class Operador extends Empleado{
    //Atributos
    private int piezas;
    private double incentivo;
    //Metodos

    @Override
    public double calcularNomina() {
        return ((sueldo +(piezas * incentivo)) * PORCENTAJE);
    }

    //Constructores

    public Operador() {
    }

    public Operador(double sueldo, String nDNI, String nombre, int idEmpleado, int piezas, double incentivo) {
        super(sueldo, nDNI, nombre, idEmpleado);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }
    //Setters y Getters

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public int getPiezas() {
        return piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }
}
