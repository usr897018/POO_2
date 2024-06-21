package corenetworks.presentacion;

import corenetworks.modelo.Cuadrado;
import corenetworks.modelo.Figura;
import corenetworks.modelo.Triangulo;

public class ProbarFigura {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(10);
        cPeque.setY(5);
        cPeque.setLado(15);
        Figura cMediano = new Cuadrado(15,10,30);
        Triangulo tPeque = new Triangulo();
        tPeque.setX(20);
        tPeque.setY(21);
        tPeque.setBase(12);
        tPeque.setAltura(3);
        Figura tMediano = new Triangulo(30,40,20,7);
        Figura[] f1 = new Figura[4];
        f1[0] = cPeque;
        f1[1] = cMediano;
        f1[2] = tPeque;
        f1[3] = tMediano;
        for(Figura elemento: f1)
        {
            System.out.println("---------Calculando el area-----------------");
            System.out.println(elemento.getClass());
            System.out.println(elemento.calcularArea());
        }

    }
}
