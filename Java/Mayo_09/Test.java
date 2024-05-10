package Java.Mayo_09;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());

        @SuppressWarnings("deprecation")
        ObrasDeArte unaNocheEstrellada = new ObrasDeArte("Vicent Van Gogh", new Date(1889, 1, 1), "pintura",
                "post impresionismo", "oleo sobre lienzo");
        unaNocheEstrellada.createRecord();

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID:" + unaNocheEstrellada.getId());


        System.console().readLine("DEMORESE");

        @SuppressWarnings("deprecation")
        ObrasDeArte venusDeMilo = new ObrasDeArte("alexandros", new Date(-160, 1, 1), "escultura", "naturalista",
                "escultura sobre marmol");
        venusDeMilo.createRecord();

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID:" + venusDeMilo.getId());

        @SuppressWarnings("deprecation")
        ObrasDeArte laNovenaSinfonia = new ObrasDeArte("Bethoven", new Date(1824, 1, 1), "musica", "clásica",
                "composicion musical");

        System.out.println(ObrasDeArte.getContadorObras());
        System.out.println(ObrasDeArte.getListaObras());
        System.out.println("ID:" + laNovenaSinfonia.getId());
        

        System.out.println("==========================");

        System.out.println(ObrasDeArte.getObraGuardadas());
    }
}
