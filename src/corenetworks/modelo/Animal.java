package corenetworks.modelo;

public class Animal {
    //Atributos

    private String tipo;
    private int numeroExtremidades;
    private boolean vuela;
    private float tamaño;

   //Metodos

    public String moverse()
    {
        return "Se Esta moviendo";
    }
    public String comer()
    {
        return "Esta comiendo";
    }
    public String sonidoEmitido()
    {
        return "Esta emitiendo sonidos";
    }

    //Constructores

    public Animal() {
    }

    public Animal(String tipo, int numeroExtremidades, boolean vuela, float tamaño) {
        this.tipo = tipo;
        this.numeroExtremidades = numeroExtremidades;
        this.vuela = vuela;
        this.tamaño = tamaño;
    }

    //Setters y Getters


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroExtremidades(int numeroExtremidades) {
        this.numeroExtremidades = numeroExtremidades;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroExtremidades() {
        return numeroExtremidades;
    }

    public boolean isVuela() {
        return vuela;
    }

    public float getTamaño() {
        return tamaño;
    }
}
