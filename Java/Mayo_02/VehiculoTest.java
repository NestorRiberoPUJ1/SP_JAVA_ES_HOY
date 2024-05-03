package Java.Mayo_02;

public class VehiculoTest {

    public static void main(String[] args) {
        /* INSTANCIA */
        System.out.println("");

        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);
        System.out.println("-----------------------");

        Vehiculo lada = new Vehiculo();

        Vehiculo mustang = new Vehiculo(4, 260, 4, 1450, 2, "muscle", "automovil", true, 4.0);
        System.out.println(mustang.getPeso());
        System.out.println("-----------------------");
        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);
        System.out.println("-----------------------");

        Vehiculo panamera = new Vehiculo(120, 1200, "gran coupé", "automovil", true, 2.8);
        System.out.println(panamera.getPuertas());
        System.out.println("-----------------------");

        Vehiculo beetle = new Vehiculo(160, 4);
        System.out.println(beetle.getRuedas());
        beetle.setVelocidad(180);
        beetle.setRuedas(5);
        System.out.println("-----------------------");

        mustang.acelerar(260);
        mustang.acelerar(280);

        panamera.acelerar(360);
        panamera.acelerar(370);

        panamera.acelerar(300, 10);
        System.out.println("-----------------------");
        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);

        new Vehiculo(220, 2);

        System.out.println("-----------------------");
        System.out.println(Vehiculo.carrosFabricados);
        System.out.println(Vehiculo.listaVehiculos);

        Vehiculo.listaVehiculos.get(4).acelerar(210);
        Vehiculo.listaVehiculos.get(4).acelerar(230);

        System.out.println(Vehiculo.getVehiculoVeloz().getVelocidad());
    }

}
