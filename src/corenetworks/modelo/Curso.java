package corenetworks.modelo;

public class Curso
{
    //1. Atributos

    private String nombre;
    private String contenido;
    private String requisitos;
    private float duracion;
    private double precio;
    private int idCurso;
    private String modlidad;
    private String tipoCurso;

    //2. Metodos
    public Curso[] mostrarCurso(String tipoCurso, String modalidad)
    {
        return new Curso[6];
    }
    public void solicitarCriteriosBusqueda()
    {
        System.out.println("Mandamos llamar a la capa presentacion");
    }
    public String mostrarInformacion()
    {
        return "id Curso: " + idCurso + " nombre: " + nombre + " Contenido: " + contenido +
                " requisitos: " + requisitos + " duracion: " + duracion + " precio: " + precio +
                " modalidad: " + modlidad + " Tipo Curso: " + tipoCurso;
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

    //4. Setters y Getters

    //Setters

    public void setIdCurso(int idCurso)
    {
        this.idCurso = idCurso;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setContenido(String contenido)
    {
        this.contenido = contenido;
    }
    public void setRequisitos(String requisitos)
    {
        this.requisitos = requisitos;
    }
    public void setDuracion(float duracion)
    {
        this.duracion = duracion;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    public void setModlidad(String modlidad)
    {
        this.modlidad = modlidad;
    }
    public void setTipoCurso(String tipoCurso)
    {
        this.tipoCurso = tipoCurso;
    }

    //Getters

    public int getIdCurso()
    {
        return idCurso;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getContenido()
    {
        return contenido;
    }
    public String getRequisitos()
    {
        return requisitos;
    }
    public String getModlidad()
    {
        return modlidad;
    }
    public String getTipoCurso()
    {
        return tipoCurso;
    }
    public float getDuracion()
    {
        return duracion;
    }
    public double getPrecio()
    {
        return precio;
    }
}
