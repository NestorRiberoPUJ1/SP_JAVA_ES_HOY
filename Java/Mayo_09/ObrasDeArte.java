package Java.Mayo_09;

import java.util.ArrayList;
import java.util.Date;

public class ObrasDeArte extends TablaBase {

    private static int contadorObras = 0;
    private static ArrayList<ObrasDeArte> listaObras = new ArrayList<ObrasDeArte>();
    private static ArrayList<String> obraGuardadas = new ArrayList<String>();

    public static ArrayList<String> getObraGuardadas() {
        return obraGuardadas;
    }

    public static void setObraGuardadas(ArrayList<String> obraGuardadas) {
        ObrasDeArte.obraGuardadas = obraGuardadas;
    }

    private String autor;
    private Date creacion;
    private String tipo;
    private String corriente;
    private String categoria;

    public ObrasDeArte(String autor, Date creacion, String tipo,
            String corriente, String categoria) {

        super(contadorObras + 1, new Date(), new Date(), new Date());
        this.autor = autor;
        this.creacion = creacion;
        this.tipo = tipo;
        this.corriente = corriente;
        this.categoria = categoria;

        contadorObras++;
        listaObras.add(this);

    }

    @Override
    public String toString() {
        String text = super.toString() + "," + autor + "," + creacion + "," + tipo + "," + corriente + "," + categoria;
        return text;
    }

    /* IMPLEMTACION DE METODOS ABSTRACTOS */
    @Override
    public void createRecord() {
        System.out.println("SE HA CREADO UNA NUEVA OBRA");
        obraGuardadas.add(this.toString());
    }

    @Override
    public void deleteRecord() {
        System.out.println("SE HA ELIMINADO UNA NUEVA OBRA");

    }

    @Override
    public void updateRecord() {
        System.out.println("SE HA ACTUALIZADO UNA NUEVA OBRA");

    }

    /* GETTERS Y SETTERS */

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorriente() {
        return corriente;
    }

    public void setCorriente(String corriente) {
        this.corriente = corriente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /* GETTERS Y SETTERS STATIC */

    public static int getContadorObras() {
        return contadorObras;
    }

    public static void setContadorObras(int contadorObras) {
        ObrasDeArte.contadorObras = contadorObras;
    }

    public static ArrayList<ObrasDeArte> getListaObras() {
        return listaObras;
    }

    public static void setListaObras(ArrayList<ObrasDeArte> listaObras) {
        ObrasDeArte.listaObras = listaObras;
    }

}
