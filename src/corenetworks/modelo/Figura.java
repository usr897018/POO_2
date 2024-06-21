package corenetworks.modelo;

public class Figura {
    //Atributos
    protected int x;
    protected int y;
    //Metodos
    public double calcularArea()
    {
        return 0;
    }
    public String mostrarPosicion()
    {
        return "La posision de la figura es X-> " + x + " y -> " + y;
    }
    //Comstructores

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Setters y Getters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
