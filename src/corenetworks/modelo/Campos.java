package corenetworks.modelo;

public class Campos {

    //Atributos
    private int x = 0;

    //Metodos

    public int muestra()
    {
        return x;
    }
    public void incrementa()
    {
        x++;
    }

    //Constructores
    public Campos(){}
    public Campos(int x)
    {
        this.x = x;
    }

    //Setters y Getters


    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }
}
