package corenetworks.modelo;

public class Guitarra extends InstrumentoMusical{
    //Atributos
    private String tipoCuerdas;
    //metodo
    @Override
    public String emitorSonido()
    {
        return "Suena una guitarra";
    }

    //Constructores


    public Guitarra() {
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    //Setters y Getters

    public void setnCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getnCuerdas() {
        return tipoCuerdas;
    }
}
