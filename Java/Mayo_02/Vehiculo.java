package Java.Mayo_02;

import java.util.ArrayList;

public class Vehiculo {

    private int pasajeros;
    private int velocidad;
    private int ruedas;
    private int peso;
    private int puertas;
    private String carroceria;
    private String categoria;
    private boolean automatico;
    private double cilindraje;

    public static int carrosFabricados = 0;
    public static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    public static Vehiculo getVehiculoVeloz() {
        Vehiculo elMasRapido = listaVehiculos.get(0);
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getVelocidad() > elMasRapido.getVelocidad()) {
                elMasRapido = vehiculo;
            }
        }
        return elMasRapido;
    }

    /*
     * FUNCION PARA ACELERAR UN CARRO, RECIBE LA VELOCIDAD OBJECTIVO int velocidad
     */
    public void acelerar(int velocidad) {
        if (velocidad <= this.velocidad) {
            System.out.println("Acelerando a " + velocidad);
        } else {
            System.out.println("Se quemó el motor");
        }
    }

    public void acelerar(int velocidad, int incrementos) {

        int velocidadActual = 0;

        while (velocidadActual < velocidad) {

            velocidadActual += incrementos;
            if (velocidadActual <= this.velocidad) {
                System.out.println("Acelerando a " + velocidadActual);
            } else {
                System.out.println("Se quemó el motor");
                break;
            }
        }

    }

    /* CONSTRUCTORES */
    public Vehiculo(int pasajeros, int velocidad, int ruedas, int peso, int puertas, String carroceria,
            String categoria, boolean automatico, double cilindraje) {
        this.pasajeros = pasajeros;
        if (velocidad <= 340) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = 340;
        }
        this.ruedas = ruedas;
        this.peso = peso;
        this.puertas = puertas;
        this.carroceria = carroceria;
        this.categoria = categoria;
        this.automatico = automatico;
        this.cilindraje = cilindraje;

        carrosFabricados += 1;
        listaVehiculos.add(this);
    }

    public Vehiculo(int velocidad, int peso, String carroceria, String categoria, boolean automatico,
            double cilindraje) {
        this.velocidad = velocidad;
        this.peso = peso;
        this.carroceria = carroceria;
        this.categoria = categoria;
        this.automatico = automatico;
        this.cilindraje = cilindraje;
        this.ruedas = 4;
        this.puertas = 4;
        this.pasajeros = 5;
        carrosFabricados += 1;
        listaVehiculos.add(this);
    }

    public Vehiculo(int velocidad, int puertas) {
        this.velocidad = velocidad;
        this.puertas = puertas;
        this.ruedas = 4;
        carrosFabricados += 1;
        listaVehiculos.add(this);
    }

    public Vehiculo() {
        carrosFabricados += 1;
        listaVehiculos.add(this);
    }

    /* GETTERS Y SETTERS */
    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad <= 340) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = 340;
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

}
