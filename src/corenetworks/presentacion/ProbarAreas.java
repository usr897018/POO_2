package corenetworks.presentacion;

import corenetworks.modelo.Areas;

public class ProbarAreas {
    public static void main(String[] args) {
        Areas a1 = new Areas();
        System.out.println("El area del circulo es " + a1.areaCirculo(15f));
        System.out.println("El area del rectangulo es " + a1.areaRectangulo(10f,2f));
    }
}
