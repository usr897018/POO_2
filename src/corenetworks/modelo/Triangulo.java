package corenetworks.modelo;

public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;
    //Metodos

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    //Constructores

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    //Setters y Getters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
