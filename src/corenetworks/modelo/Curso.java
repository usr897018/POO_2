package corenetworks.modelo;

public class Curso
{
    //1. Atributos

    public String nombre;
    public String contenido;
    public String requisitos;
    public float duracion;
    public double precio;
    public int idCurso;
    public String modlidad;
    public String tipoCurso;

    //2. Metodos
    public Curso[] mostrarCurso(String tipoCurso, String modalidad)
    {
        return new Curso[6];
    }
    public void solicitarCriteriosBusqueda()
    {
        System.out.println("Mandamos llamar a la capa presentacion");
    }
    //3. Constructores

    //Constructor vacio
    public Curso(){}

    //Constructor
    public Curso(int idCurso,String nombre,double precio,float duracion)
    {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    //4. Setter y Getters
}
