package Ejercicio7_POO;

/** @author galvi
 * Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco, para lo cuál tendremos 2 clases (Cliente y
 * Cuenta). Considerar que un cliente se caracteriza por su nombre, apellido y DNI. El cliente puede consultar saldo, así
 * como ingresar y retirar dinero de sus cuentas. Además, cada cuenta se caracteriza por un número de cuenta y un saldo.
 *** Objeto --> Dos instancias (Cliente y Cuenta). Constructor Cliente con 4 parámetros, Constructor Cuenta con 2 parámetros
 *** Atributos Cliente --> (nombre, apellido y DNI (String), cuentas[] Cuenta)
 *** Atributos Cuenta --> (numeroCuenta (int) y saldo (double)).
 *** Métodos: getNombre(): String, getApellido(): String, getDNI(): String, consultar_saldo(int n): double,
 *** ingresar_dinero(int n, double cantidad): void, retirar_dinero(int n, double cantidad): void.
 *** Métodos Cuenta: getNumeroCuenta(): int, getSaldo(): double,
 *** ingresarDinero(double cantidad): void, retirarDinero(double cantidad): void
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
}
