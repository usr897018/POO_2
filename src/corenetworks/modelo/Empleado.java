package corenetworks.modelo;

public class Empleado {

    //Atributos

    protected int idEmpleado;
    protected String nombre;
    protected String nDNI;
    protected double sueldo;
    protected final double PORCENTAJE = 0.75;

    //Metodos

    public double calcularNomina()
    {
        return sueldo * 0.86;
    }

    //Constructores


    public Empleado() {
    }

    public Empleado(double sueldo, String nDNI, String nombre, int idEmpleado) {
        this.sueldo = sueldo;
        this.nDNI = nDNI;
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    //Setters y Getters


    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnDNI(String nDNI) {
        this.nDNI = nDNI;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnDNI() {
        return nDNI;
    }

    public double getSueldo() {
        return sueldo;
    }
}
