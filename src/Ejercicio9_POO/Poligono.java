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

public abstract class Poligono {

    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "Número Lados=" + numeroLados +
                '}';
    }

    public abstract double area();
}
