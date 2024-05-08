package Java.Mayo_07;

public class PostreTest {
    public static void main(String[] args) {

        Postre bananamaster = new Postre();
        bananamaster.setNombre("Banana Master");
        bananamaster.setMomento("Postre");
        bananamaster.consumir();

        Postre bananasplit = new Postre(true, true, "Banana Split", false, false, "Americano", "Leche", false, true,
                false, "chispas de colores");

    }
}
