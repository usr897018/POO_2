package corenetworks.presentacion;

import corenetworks.modelo.Empleado;
import corenetworks.modelo.Gerente;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSueldo(1500);
        System.out.println("nomina -> " + g1.calcularNomina());
        Gerente g2 = new Gerente(3000,"123456123J",
                   "Pedrito",1,"Perfumeria",20, 500);
        System.out.println("Nomina -> " + g2.calcularNomina());
        //Poliformismo

        //UpCasting
        Empleado ePolimorfismo = new Gerente(1500,"1234567J","david",2,
                           "Ventas",20,300);
        Gerente g3 = new Gerente(1500,"1234567J","david",2,
                "Ventas",20,300);

        //UpCasting
        Empleado ePoliformismo2 = g3;
        //DownCasting
        Gerente g4 = (Gerente)ePolimorfismo;

        System.out.println(ePolimorfismo.getIdEmpleado());
        System.out.println(ePolimorfismo.calcularNomina());
        Empleado[] empleados = new Empleado[3];
        empleados[0] = ePolimorfismo;
        empleados[1] = new Empleado(2000,"123456D","Mateo",3);
        empleados[2] = new Empleado(2000,"183456D","Marta",4);

        for(Empleado elemento: empleados)
        {
            System.out.println("--------------Calculando la nomina adecuada---------------");
            System.out.println(elemento.getClass());
            System.out.println(elemento.calcularNomina());
        }
    }
}
