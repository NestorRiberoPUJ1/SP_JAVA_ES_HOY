package Java.Mayo_07;

public interface Cinetica {

    final double g = 9.8;
    final double pi = 3.1416;

    abstract void acelerar(double a, double t );
    abstract void frenar(double a, double t );

    public default void movRectUnif(double vel, double t) {
        double distancia = vel * t;
        System.out.println("Recorrió " + distancia);
    }

    public default void movUnifAcc(double v0, double a, double t) {
        double distancia = (v0 * t) + (0.5 * a * t * t);
        System.out.println("Recorrió " + distancia);
    }

}
