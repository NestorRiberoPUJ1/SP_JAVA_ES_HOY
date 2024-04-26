package Java.Abril_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class VariablesTest {
    public static void main(String[] args) {
        double estatura = 1.87;
        int estaruraCerrada;

        estaruraCerrada = (int) estatura;

        float estaturaFlotante = estaruraCerrada;

        System.out.println(estatura);
        System.out.println(estaruraCerrada);
        System.out.println(estaturaFlotante);

        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Suma: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Tiempo de ejecución: " + total + " segundos");

        long start2 = System.currentTimeMillis();
        int sum2 = 0;
        for (byte i = 0; i < 100; i++) {
            sum2 += i;
        }
        System.out.println("Suma: " + sum2);
        long end2 = System.currentTimeMillis();
        double total2 = (double) (end2 - start2) / 1000;
        System.out.println("Tiempo de ejecución: " + total2 + " segundos");

        int[] bingo;
        bingo = new int[5];
        bingo[0] = 12;
        bingo[1] = 16;
        bingo[2] = 32;
        bingo[3] = 18;
        bingo[4] = 7;

        System.out.println(bingo[3]);
        if (bingo[4] == 12) {
            System.out.println("GANO");
        }

        int[] loteria = { 4, 8, 48, 5, 9 };
        System.out.println(loteria[4]);

        ArrayList<Integer> chance = new ArrayList<Integer>();
        chance.add(42);
        chance.add(38);
        System.out.println(chance);
        chance.add(18);
        System.out.println(chance);
        System.out.println(Integer.MAX_VALUE);

        int num = 0;

        while (num < 7) {
            num = (int) (Math.random() * 10);
            System.out.println(num);
        }
        System.out.println("-----------------------");
        for (int i = 0; i > -20; i--) {
            System.out.println(i);
        }

        System.out.println("-----------------------");
        for (int i = 0; i < loteria.length; i++) {
            System.out.println(loteria[i]);
        }

        System.out.println("-----------------------");
        for (Integer numero : chance) {
            System.out.println(numero);
        }

        HashMap<String, String> glosario = new HashMap<String, String>();
        glosario.put("perro", "Mamifero perteneciente a la familia de los cánidos");
        glosario.put("gato", "Mamifero perteneciente a la familia de los félidos");
        glosario.put("chinchilla", "Mamifero perteneciente a la familia de los roedores");
        glosario.put("alpaca", "Mamifero perteneciente a la familia de los camélidos");

        System.out.println(glosario);

        System.out.println(glosario.get("chinchilla"));
        /* Extraccion de llaves */
        Set<String> keys = glosario.keySet();
        System.out.println(keys);
        for(String key : keys) {
            System.out.println(key);
            System.out.println(glosario.get(key));    
        }

    }
}
