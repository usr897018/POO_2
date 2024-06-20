package corenetworks.presentacion;

import corenetworks.modelo.Campos;

public class ProbarCampos {
    public static void main(String[] args) {
        Campos c1 = new Campos(2);
        System.out.println("el Valor de X es " + c1.muestra());
        c1.incrementa();
        System.out.println("si incrementamos su valor su nuevo valor es " + c1.muestra());
    }
}
