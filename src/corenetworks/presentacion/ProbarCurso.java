package corenetworks.presentacion;

import corenetworks.modelo.Curso;

public class ProbarCurso {
    public static void main(String[] args) {
        //instanciar la clase curso
        Curso c1 = new Curso(1,"progrmacion en java",1500.00,60f);
        System.out.println(c1.mostrarInformacion());
        c1.setRequisitos("Eso");
        c1.setModlidad("Presencial");
        c1.setTipoCurso("Informatica");
        c1.setContenido("JSE y acceso a BBDD");
        System.out.println(c1.mostrarInformacion());
        System.out.println(c1.getTipoCurso());
    }
}
