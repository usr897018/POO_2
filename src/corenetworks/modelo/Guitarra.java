package corenetworks.modelo;

public class Guitarra extends InstrumentoMusical{
    //Atributos
    private String nCuerdas;
    //metodo
    @Override
    public String emitorSonido()
    {
        return "Suena una guitarra";
    }

    //Constructores


    public Guitarra() {
    }

    public Guitarra(String marca, String nCuerdas) {
        super(marca);
        this.nCuerdas = nCuerdas;
    }

    //Setters y Getters

    public void setnCuerdas(String nCuerdas) {
        this.nCuerdas = nCuerdas;
    }

    public String getnCuerdas() {
        return nCuerdas;
    }
}
