package corenetworks.modelo;

import java.util.Random;

public class Dado {
    //Atributos
    private Random numeroAleatorio;
    private int valor;

    //metodos
    public String representacion(int valor)
    {
        switch (valor)
        {
            case 1:
                return "\n\n" + " * " + "\n";
              //  break;
            case 2:
                return  "\n" + "  *" + "\n " + "\n" + "*  ";
            //break;
            case 3:
                return  "\n" + "  *" + "\n" + " * " + "\n" + "*  ";
            //break;
            case 4:
                return  "\n" + "*  *" + "\n" + "  " + "\n" + "*  *";
            //break;
            case 5:
                return  "\n" + "*  *" + "\n" + " * " + "\n" + "*  *";
            //break;
            case 6:
                return  "\n" + "*  *" + "\n" + "*  *" + "\n" + "*  *";
            //break;
        }
        return "Error";
    }
    public String uno()
    {
        return  "\n\n" + " * " + "\n";
    }
    public String dos()
    {
        return  "\n" + "  *" + "\n " + "\n" + "*  ";
    }
    public String tres()
    {
        return  "\n" + "  *" + "\n" + " * " + "\n" + "*  ";
    }
    public String cuatro()
    {
        return  "\n" + "*  *" + "\n" + "  " + "\n" + "*  *";
    }
    public String cinco()
    {
        return  "\n" + "*  *" + "\n" + " * " + "\n" + "*  *";
    }
    public String seis()
    {
        return  "\n" + "*  *" + "\n" + "*  *" + "\n" + "*  *";
    }

    public String lanzar()
    {
        valor = numeroAleatorio.nextInt(1,7);
        return "El valor del dado es: " + valor + representacion(valor);
    }
    //Comstructores
    public Dado()
    {
        numeroAleatorio = new Random();
        valor = numeroAleatorio.nextInt(1,7);

    }

}
