package corenetworks.modelo;

public class Usuario {

    //Atributos

    private String usuario;
    private String contrasena;
    private String nombre;
    private String direccion;


    //Metodos

    public String mostrarInformacion()
    {
        return "suario: " + usuario + " Contraseña: " + contrasena + " nombre: " + nombre +
               " direccion: "  + direccion;
    }

    //Constructores

    public Usuario(){}
    public Usuario(String usuario, String contrasena, String nombre,String direccion)
    {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Setters

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Getters

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
