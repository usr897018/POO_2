package corenetworks.presentacion;

public class Main {
    public static void main(String[] args) {
        //Instanciar o crear un objeto

        Coche c1 = new Coche();

        //Asignar valor a los otributos
        //nomenglatura objeto

        c1.color = "Amarillo";
        c1.electrico = false;
        c1.tipoRuedas = "Deportivas";

        System.out.println(c1.acelerar());
        System.out.println(c1.aparcar());
        System.out.println(c1.frenar());

        //Se pueden tener varios objetos de una misma clase

        Coche c2 = new Coche("Rojo",true,"Deportivas");

        //Asignar valor a los otributos
        //nomenglatura objeto

    }
}