package corenetworks.modelo;

public class Alumno {

    //Atributos
    private String nombre;
    private int nNotas;
    private float[] notas;
    private float notaFinal;

    //Metodos
    public void introducirNotas(float nota1,float nota2,float nota3)
    {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        for(int i = 0; i <= 2; i++)
        {
            notaFinal += notas[i];
        }
        notaFinal /= 3;
    }
    public void introducirNota(int posicion,float nota)
    {
        notas[posicion] = nota;
    }

    public String mostrarAlumno()
    {
        return  "la nota final de alumno " + nombre + " es: " + notaFinal;
    }
    public float mostrarPromedio()
    {
        return notaFinal;
    }
    public String mostrarNotas()
    {
        return "La nota del primer trimestre es : " + notas[0] + " La nota del segundo trimestre es : " + notas[1] +
                " La nota del tercer trimestre es : " + notas[2];
    }

    //Comstructores

    public Alumno() {}

    public Alumno( String nombre,int nNotas) {
        this.notas = new float[nNotas];
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
