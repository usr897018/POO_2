package corenetworks.modelo;

public class Multiplicar {

    //Atributos
    private int numero;

    //Metodos
    public String mostrarTabla()
    {
        String[] tabla = new String[10];
        for(int i = 1; i <= 10 ; i++)
        {
            tabla[i-1] = " " + i + " X " + numero + " = " + i * numero;
        }
        return tabla[0] + "\n" + tabla[1] + "\n" + tabla[2] + "\n" + tabla[3] + "\n" + tabla[4] + "\n" +
                tabla[5] + "\n" + tabla[6] + "\n" + tabla[7] + "\n" +tabla[8] + "\n" + tabla[9];
    }

    //Constructores

    public Multiplicar() {}
    public Multiplicar(int numero)
    {
        this.numero = numero;
    }

    //Setters y Getters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
