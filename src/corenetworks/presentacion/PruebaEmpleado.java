package corenetworks.presentacion;

import corenetworks.modelo.Empleado;
import corenetworks.modelo.Gerente;
import corenetworks.modelo.Operador;
import corenetworks.modelo.Vendedor;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente(2000,"123456F","David",
                1,"Perfumeria",3,200);
        Empleado vendedor = new Vendedor(1000,"12345342G","Manolo",
                2,15000,0.01);
        Empleado operador = new Operador(1000,"2332244F","Luisa",
                3,2000,0.0001);

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
