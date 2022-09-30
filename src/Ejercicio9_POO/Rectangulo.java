package Ejercicio9_POO;

/** Ejercicio 9: Hacer un programa para calcular el área de Polígonos (triángulos y rectángulos). El programa debe ser
 * capaz de almacenar en un arreglo N, los triángulos y rectángulos, y al final debe mostrar el área y los datos de cada uno.
 * Para ello, se tendrá lo siguiente: Una super clase llamada Polígono, dos subclases llamadas Triángulo y Rectángulo.
 * Objetos: Polígono (Padre), Triángulo y Rectángulo (Hijos)
 * Atributos y Métodos:
 ** Poligono (abstract): #numeroLados: int, + toString(): String, + area(): double (abstract too)
 ** Rectángulo: -lado1: double, - lado2: double, + toString(): String, + area(): double.
 ** Triángulo: - lado1, lado2 y lado3: double,  + toString(): String, + area(): double.
 * */

public class Rectangulo extends Poligono{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: {" +
                "Número Lados =" + numeroLados +
                ", lado 1 =" + lado1 +
                ", lado 2 =" + lado2 +
                '}';
    }

    @Override
    public double area() {
        return lado1*lado2;
    }
}
