package corenetworks.presentacion;

import corenetworks.modelo.Bateria;
import corenetworks.modelo.Flauta;
import corenetworks.modelo.Guitarra;
import corenetworks.modelo.InstrumentoMusical;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("genaro","nylon");
        InstrumentoMusical bataca = new Bateria("WGF",2);
        InstrumentoMusical ham = new Flauta("Picardo","Metal");
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = guido;
        instrumentos[1] = bataca;
        instrumentos[2] = ham;
        for(InstrumentoMusical elemento: instrumentos)
        {
            System.out.println("---------------------------");
            System.out.println(elemento.getClass());
            System.out.println(elemento.emitorSonido());
        }

    }
}
