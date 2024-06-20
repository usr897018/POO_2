package corenetworks.presentacion;

import corenetworks.modelo.Animal;

public class ProbarAnimal {
    public static void main(String[] args) {
        Animal perro = new Animal("Terrestre",4,false,300f);
        Animal pez = new Animal("Anfibio",2,false,30f);
        Animal cocodrilo = new Animal("Reptil",4,false,2000f);
        System.out.println("el Perro " +perro.moverse());
        System.out.println("el Perro " +perro.comer());
        System.out.println("el Perro " +perro.sonidoEmitido());
        System.out.println("el pez " +pez.moverse());
        System.out.println("el pez " +pez.comer());
        System.out.println("el pez " +pez.sonidoEmitido());
        System.out.println("el cocodrilo " +cocodrilo.moverse());
        System.out.println("el cocodrilo " +cocodrilo.comer());
        System.out.println("el cocodrilo " +cocodrilo.sonidoEmitido());
    }
}
