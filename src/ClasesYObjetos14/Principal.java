package ClasesYObjetos14;

/**
 *                                                 Vehículo
 *                                            # matricula: String
 *                                            # marca: String
 *                                            # modelo: String
 *                                          + mostrarDatos(): String
 *
 *          VehículoTurismo                   VehículoDeportivo                    VehículoFurgoneta
 *       - numeroPuertas: int                 - cilindrada: int                     - carga : int
 *     + mostrarDatos(): String            + mostrarDatos(): String            + mostrarDatos(): String
 * */
public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ", "Audi", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
        misVehiculos[3] = new VehiculoFurgoneta("JI8", "Mazda", "J9", 2000);

        for (Vehiculo vehiculos: misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
