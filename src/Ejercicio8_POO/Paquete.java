package Ejercicio8_POO;

/** @author galvi
 * Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país. Cada sucursal está definida por su
 * número de sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en
 * cuenta el precio del paquete y la prioridad, sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es
 * alta y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.
 *** Objeto --> Dos instancias (Sucursal y Paquete). Constructor Sucursal - 3 parámetros, Constructor Paquete - 4 params
 *** Atr Sucursal --> (número de sucursal (int), dirección y ciudad(String))
 *** Atr Paquete --> (númeroPaquete (int), DNI (String), peso (double) y prioridad (int)).
 *** Métodos Sucursal: Constructor, getNumeroSucursal(): int, getDireccion(): String, getCiudad(): String,
 *** mostrarDatosSucrusal(): String y calcular_precio(Paquete t): double
 *** Métodos Paquete: Constructor, getNumeroPaquete(): int, getDni(): String, getPeso(): double, getPrioridad(): int, y
 *** mostrarDatosPaquete(): String
 */
public class Paquete {
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;      // 0 = normal, 1 = alta, 2 = express

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String mostrarDatosPaquete(){
        return "\nNúmero paquete: "+numeroPaquete
                +"\nDNI: "+dni
                +"\nPeso: "+peso
                +"\nPrioridad: "+prioridad;
    }
}
