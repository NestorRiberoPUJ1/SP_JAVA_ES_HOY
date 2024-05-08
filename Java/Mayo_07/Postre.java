package Java.Mayo_07;

public class Postre extends Comida {

    private String base;
    private boolean harina;
    private boolean frutal;
    private boolean nueces;
    private String toppings;

    public Postre() {
    }

    public Postre(boolean vegetariano, boolean fresco, String nombre, boolean cocinable,
            boolean picante, String origen, String base, boolean harina, boolean frutal, boolean nueces,
            String toppings) {
        super(vegetariano, false, fresco, nombre, cocinable, picante, "Postre", origen);
        this.base = base;
        this.harina = harina;
        this.frutal = frutal;
        this.nueces = nueces;
        this.toppings = toppings;
    }

    /* GETTER Y SETTERS */
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public boolean isHarina() {
        return harina;
    }

    public void setHarina(boolean harina) {
        this.harina = harina;
    }

    public boolean isFrutal() {
        return frutal;
    }

    public void setFrutal(boolean frutal) {
        this.frutal = frutal;
    }

    public boolean isNueces() {
        return nueces;
    }

    public void setNueces(boolean nueces) {
        this.nueces = nueces;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

}
