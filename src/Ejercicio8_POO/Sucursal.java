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
public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostrarDatosSucursal(){
        return "\nNumero sucursal: "+numeroSucursal
                +"\nDirección: "+direccion
                +"\nCiudad: "+ciudad;
    }

    public double calcular_precio(Paquete t){
        double precio;
        precio = t.getPeso();
        if(t.getPrioridad() == 1){
            precio += 10;
        }
        if(t.getPrioridad() == 2){
            precio += 20;
        }
        return precio;
    }
}
