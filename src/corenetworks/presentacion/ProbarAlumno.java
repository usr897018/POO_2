package corenetworks.presentacion;

import corenetworks.modelo.Alumno;

import java.util.Scanner;

public class ProbarAlumno {
    public static void main(String[] args) {
        Scanner datosEntrada = new Scanner(System.in);
        String nAlumno;
        boolean done = true;
        int nNotas, posicionNota;
        float nota;
        System.out.println("introduce el nombre del alumno: ");
        nAlumno = datosEntrada.nextLine();
        System.out.println("Cuantas notas desea introducir: ");
        nNotas = datosEntrada.nextInt();
        Alumno a1 = new Alumno(nAlumno,nNotas);
        while(done)
        {
            System.out.println("se an creado " + nNotas + " espacios de notas");
            System.out.println("si no quiere almacenar mas notas introduzca un numero mayor al espacio de notas"
                                +" en que espacio quiere almacenar la nota:");
            posicionNota = datosEntrada.nextInt();
            if(posicionNota <= nNotas && posicionNota >= 1)
            {
                System.out.println("introduzca la nota en la posicion " + posicionNota + ": " );
                nota = datosEntrada.nextFloat();
                if(nota <= 10 && nota >= 0)
                {
                    a1.introducirNota(posicionNota,nota);
                }
            }
            else
            {
                done = false;
            }

        }
        a1.introducirNotas(5,5,5);
        System.out.println(a1.mostrarAlumno());
        System.out.println("EL promedio de notas es: " + a1.mostrarPromedio());
        System.out.println(a1.mostrarNotas());
    }

}
