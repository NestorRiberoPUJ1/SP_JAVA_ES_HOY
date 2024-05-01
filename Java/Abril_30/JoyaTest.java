package Java.Abril_30;

public class JoyaTest {

    public static void main(String[] args) {

        /* CREACION DE INSTANCIA/OBJETO */
        Joya promiseRing = new Joya();

        /* ASIGNACION DE VALOR MATERIAL */
        promiseRing.setMaterial("Platino");
        /* ASIGNACION DE VALOR MATERIAL */
        promiseRing.setMaterial("Oro Blanco");
        /* LECTURA DE VALOR MATERIAL */
        System.out.println(promiseRing.getMaterial());

        promiseRing.setMarca("Harry Winston");
        promiseRing.setGramaje(24);
        promiseRing.setPiedra("Diamante");
        promiseRing.setOrigen("Sudafrica");
        promiseRing.setGenero('F');
        promiseRing.setPrecio(25000);
        promiseRing.setTipo("Anillo de Promesa");


        System.out.println(promiseRing.getMarca());

        if(promiseRing.getPrecio()>15000){
            System.out.println("Tocó sacar un prestamo");
        }


    }

}
