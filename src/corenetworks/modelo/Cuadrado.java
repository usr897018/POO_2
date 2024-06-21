package corenetworks.modelo;

public class Cuadrado extends Figura{
    //Atributos
    private double lado;
    //Metodos

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    //Constructores

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    //Setter y Getters

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
