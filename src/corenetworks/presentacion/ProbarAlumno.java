package corenetworks.presentacion;

import corenetworks.modelo.Alumno;

public class ProbarAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("David");
        a1.introducirNotas(5,5,5);
        System.out.println(a1.mostrarAlumno());
        System.out.println("EL promedio de notas es: " + a1.mostrarPromedio());
        System.out.println(a1.mostrarNotas());
    }

}
