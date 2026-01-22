package tema8.vehiculos;

public class MainVehiculos {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Vehiculo", 120);
        Coche c = new Coche("KIA", 180);
        Moto m = new Moto("Yamaha", 150, "Deportivo");
        Camion ca = new Camion("Volvo", 140, 10);
        CocheElectrico ce = new CocheElectrico("Tesla", 200, 500);
        
        
        System.out.println("-------VEHÍCULO-------");
        v.mostrarInfo();
        System.out.println("-------COCHE-------");
        c.mostrarInfo();
        System.out.println("-------MOTO-------");
        m.mostrarInfo();
        System.out.println("-------CAMIÓN-------");
        ca.mostrarInfo();
        System.out.println("---COCHE ELÉCTRICO--------");
        ce.mostrarInfo();
        
    }
}
