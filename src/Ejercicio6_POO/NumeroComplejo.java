package Ejercicio6_POO;

/** @author galvi
 * Ejercicio 6: Construir un programa para trabajar con dos números completos. Implementar el siguiente menú:
 * 1. Sumar dos números complejos. 2. Multiplicar dos números completos. 3 Comparar (iguales o no). 4. Multiplicar un
 * número completo por un entero.
 *** Objeto --> Número complejo (un solo constructor que tenga parte real y parte imaginaria).
 *** Atributos --> real (double), imaginaria (double con nomenclatura).
 *** Métodos: sumarComplejos(Complejo c), multiplicarComplejos(Complejo c), compararComplejos(boolean),
 *** MultiplicarEnteroComplejo(Complejo c), getA(), getB()
 */
public class NumeroComplejo {

    private double a;       // real
    private double b;   //imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /* Suma --> num1 = 3 + 4i, num2 = 2 + 5i, suma = 5 + 9i
     * NumeroComplejo (num1) = new NumeroComplejo(3,4) [3 + 4i] --> num1.calcularSuma(num2)
     */
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /* num1 = 3 + 4i, num2 = 2 + 5i, mult = (3*2 - 4*5) + (3*5 + 4*2)i
     * NumeroComplejo (num1) = new NumeroComplejo(3,4) [3 + 4i] --> num1.calcularMultiplicacion(num2)
     */
    public NumeroComplejo calcularMultiplicacion(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b*c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    // Comparar parte real y parte imaginaria
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        if((a == c.getA()) && b == c.getB()){
            igualdad = true;
        }
        return igualdad;
    }

    /* num1 = 3 + 4i,      * entero = 2     * mult = 6 + 8i  */

    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo multe = new NumeroComplejo(a*x, b*x);
        return multe;
    }
}
