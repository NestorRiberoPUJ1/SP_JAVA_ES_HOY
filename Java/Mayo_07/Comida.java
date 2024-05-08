package Java.Mayo_07;

public class Comida {

    private boolean vegetariano;
    private boolean salado;
    private boolean fresco;
    private String nombre;
    private boolean cocinable;
    private boolean picante;
    private String momento;
    private String origen;

    public Comida() {
    }

    public Comida(boolean vegetariano, boolean salado, boolean fresco, String nombre, boolean cocinable,
            boolean picante, String momento, String origen) {
        this.vegetariano = vegetariano;
        this.salado = salado;
        this.fresco = fresco;
        this.nombre = nombre;
        this.cocinable = cocinable;
        this.picante = picante;
        this.momento = momento;
        this.origen = origen;
    }


    public void consumir(){
        System.out.println("Se ha consumido "+this.nombre+" como plato "+this.momento);
    }

    /* GETTERS Y SETTERS */
    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public boolean isSalado() {
        return salado;
    }

    public void setSalado(boolean salado) {
        this.salado = salado;
    }

    public boolean isFresco() {
        return fresco;
    }

    public void setFresco(boolean fresco) {
        this.fresco = fresco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCocinable() {
        return cocinable;
    }

    public void setCocinable(boolean cocinable) {
        this.cocinable = cocinable;
    }

    public boolean isPicante() {
        return picante;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

}
