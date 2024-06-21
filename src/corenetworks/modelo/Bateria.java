package corenetworks.modelo;

public class Bateria extends InstrumentoMusical{
    //Atributos
    private int nPlatillos;
    //metodo
    @Override
    public String emitorSonido()
    {
        return "Suena una Bateria";
    }

    //Constructores


    public Bateria() {
    }

    public Bateria(String marca, int nPlatillos) {
        super(marca);
        this.nPlatillos = nPlatillos;
    }

    //Setters y Getters

    public void setnCuerdas(int nPlatillos) {
        this.nPlatillos = nPlatillos;
    }

    public int getnCuerdas() {
        return nPlatillos;
    }
}
