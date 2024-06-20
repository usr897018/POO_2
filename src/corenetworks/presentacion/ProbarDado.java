package corenetworks.presentacion;

import corenetworks.modelo.Dado;

import java.util.Scanner;

public class ProbarDado {
    public static void main(String[] args) {
        boolean done = true;
        String tecla;
        Scanner datosEntrada = new Scanner(System.in);
        Dado d1 = new Dado();
//        System.out.println(d1.uno());
//        System.out.println(d1.dos());
//        System.out.println(d1.tres());
//        System.out.println(d1.cuatro());
//        System.out.println(d1.cinco());
//        System.out.println(d1.seis());
        while (done) {
            System.out.println(d1.lanzar());
            System.out.println("Pulsa " + "\"" + "S" + "\"" + " para volver a lanzar u otra tecla para salir");
            tecla = datosEntrada.nextLine();
            if (tecla.equalsIgnoreCase("s")) {
                done = true;
            } else {
                done = false;
            }
        }

    }
}
