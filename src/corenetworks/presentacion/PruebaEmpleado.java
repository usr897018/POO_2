package corenetworks.presentacion;

import corenetworks.modelo.Empleado;
import corenetworks.modelo.Gerente;
import corenetworks.modelo.Operador;
import corenetworks.modelo.Vendedor;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente(3000,"123456F","David",
                1,"Perfumeria",3,300);
        Empleado vendedor = new Vendedor(1500,"12345342G","Manolo",
                2,100,0.25);
        Empleado operador = new Operador(1200,"2332244F","Luisa",
                3,100,0.25);

        Empleado[] empleados = new Empleado[3];
        empleados[0] = gerente;
        empleados[1] = vendedor;
        empleados[2] = operador;
        for(Empleado elemento: empleados)
        {
            System.out.println("----------------Calculando nominas-----------------");
            System.out.println(elemento.getClass());
            System.out.println(elemento.calcularNomina());
        }

    }
}
