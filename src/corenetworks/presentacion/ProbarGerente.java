package corenetworks.presentacion;

import corenetworks.modelo.Gerente;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSueldo(1500);
        System.out.println("nomina -> " + g1.calcularNomina());
        Gerente g2 = new Gerente(3000,"123456123J",
                   "Pedrito",1,"Perfumeria",20, 500);
        System.out.println("Nomina -> " + g2.calcularNomina());
    }
}
