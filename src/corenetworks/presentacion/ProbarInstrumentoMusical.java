package corenetworks.presentacion;

import corenetworks.modelo.Bateria;
import corenetworks.modelo.Flauta;
import corenetworks.modelo.Guitarra;
import corenetworks.modelo.InstrumentoMusical;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical gitarra = new Guitarra("genaro","7");
        InstrumentoMusical bateria = new Bateria("WGF","2");
        InstrumentoMusical flauta = new Flauta("Picardo","Metal");
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = gitarra;
        instrumentos[1] = bateria;
        instrumentos[2] = flauta;
        for(InstrumentoMusical elemento: instrumentos)
        {
            System.out.println(elemento.emitorSonido());
        }

    }
}
