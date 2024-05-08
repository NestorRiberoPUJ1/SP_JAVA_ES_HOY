package Java.Mayo_07;

public class ScooterTest {
    public static void main(String[] args) {


        Scooter xiaomi = new Scooter(2, 14);

        System.out.println(xiaomi.getVelocidad());
        xiaomi.acelerar(4, 3);
        System.out.println(xiaomi.getVelocidad());

        xiaomi.movRectUnif(12,30);
        xiaomi.movUnifAcc(12, 1, 4);

    }
}
