package corenetworks.modelo;

public class Bateria extends InstrumentoMusical{
    //Atributos
    private String nPlatillos;
    //metodo
    @Override
    public String emitorSonido()
    {
        return "Suena una Bateria";
    }

    //Constructores


    public Bateria() {
    }

    public Bateria(String marca, String nPlatillos) {
        super(marca);
        this.nPlatillos = nPlatillos;
    }

    //Setters y Getters

    public void setnCuerdas(String nPlatillos) {
        this.nPlatillos = nPlatillos;
    }

    public String getnCuerdas() {
        return nPlatillos;
    }
}
