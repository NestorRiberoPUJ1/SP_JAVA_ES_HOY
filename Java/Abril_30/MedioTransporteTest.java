package Java.Abril_30;

public class MedioTransporteTest {

    public static void main(String[] args) {

        String[] nombre = {};

        MedioTransporte chino = new MedioTransporte();
        chino.capacidad = 5000;
        chino.medio = "Terrestre";
        chino.velocidadMaxima = 90;
        chino.carga = false;
        chino.masivo = true;
        chino.unidadVelocidad = "km/h";

        MedioTransporte metropolitano = new MedioTransporte();
        metropolitano.capacidad = 10500;
        metropolitano.medio = "Terrestre";
        metropolitano.velocidadMaxima = 80;
        metropolitano.carga = false;
        metropolitano.masivo = true;
        metropolitano.unidadVelocidad = "km/h";

        MedioTransporte barcoGeneral = new MedioTransporte();
        barcoGeneral.capacidad = 1000000;
        barcoGeneral.medio = "Acuático";
        barcoGeneral.velocidadMaxima = 8;
        barcoGeneral.carga = true;
        barcoGeneral.masivo = false;
        barcoGeneral.unidadVelocidad = "kn/h";

        System.out.println("");
        System.out.println(nombre);
        System.out.println(chino.capacidad);
        System.out.println(metropolitano.medio);
        System.out.println(barcoGeneral.unidadVelocidad);

    }

}
