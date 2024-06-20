package corenetworks.modelo;

public class Alumno {

    //Atributos
    private String nombre;
    private int nNotas;
    private float[] notas;
    private float notaFinal;

    //Metodos

    public void introducirNota(int posicion,float nota)
    {
        notas[posicion] = nota;
    }

    public String mostrarAlumno()
    {
        return  "la nota final de alumno " + nombre + " es: " + mostrarPromedio();
    }
    public float mostrarPromedio()
    {
        notaFinal = 0;
        for(int i = 1; i < notas.length; i++)
        {
            notaFinal += notas[i];
        }
        notaFinal /= nNotas;
        return notaFinal;
    }
    public String mostrarNotas()
    {
        String textoNotas = "",paso;
        for(int i = 1; i < notas.length; i++)
        {

            textoNotas = textoNotas + " " + notas[i];
        }
        return textoNotas;
    }

    //Comstructores

    public Alumno() {}

    public Alumno( String nombre,int nNotas) {
        this.nNotas = nNotas;
        this.notas = new float[nNotas+1];
        this.nombre = nombre;
    }

    //Setters y Getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
}
