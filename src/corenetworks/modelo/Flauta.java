package corenetworks.modelo;

public class Flauta extends InstrumentoMusical{
    //Atributos
    private String material;
    //metodo
    @Override
    public String emitorSonido()
    {
        return "Suena una Flauta";
    }

    //Constructores


    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    //Setters y Getters

    public void setnCuerdas(String material) {
        this.material = material;
    }

    public String getnCuerdas() {
        return material;
    }
}
