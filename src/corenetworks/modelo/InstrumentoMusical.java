package corenetworks.modelo;

public class InstrumentoMusical {
    //Atributos
    protected String marca;
    //metodos
    public String emitorSonido()
    {
        return "Sonido del instrumento";
    }
    //Constructores

    public InstrumentoMusical() {
    }
    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }
    //Setters y Getters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
