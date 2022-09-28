package ClasesYObjetos15;

/**
 * Conversión ascendente de tipos (Upcasting). Convertir un objeto de la subclase (clase hija) a la super clase (clase padre)
 * Conversión descendente de tipos (Downcasting). Convertir un objeto de la clase padre a la clase hija
 * */
public class Principal {
    public static void main(String[] args) {
        VehiculoTurismo miVehiculo = new VehiculoTurismo("ABC1", "BMW", "B9", 4);
        //Referencia del objeto                // Instanciación del objeto

        Vehiculo v1 = miVehiculo;           // Guardar un objeto de la subclase dentro de la superclase. Esto es polimorfirmo
        System.out.println(v1);             // Esto demuestra que el nuevo vehículo guardado será de la subclase

        // Todo se puede ejecutar en una sola línea

        Vehiculo v2 = new VehiculoTurismo("ABCD123", "Zonas", "Z1", 2);
        System.out.println(v2);
    }

/*    public static void main(String[] args) {
        Vehiculo v1 = new VehiculoTurismo("ABCD123", "Zonas", "Z1", 2);     // esto es un upcasting
        // Se hará que v1 sea un vehículo de la clase padre

        System.out.println(v1);
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) v1;
        System.out.println(nuevoVehiculo);

        System.out.println("");
        Vehiculo v0 = new VehiculoDeportivo("ZZZ1", "Bugatti", "HI9", 400);
        System.out.println(v0);

        VehiculoDeportivo nuevoVehiculoDeportivo = (VehiculoDeportivo) v0;
        System.out.println(nuevoVehiculoDeportivo);
    }*/
}
