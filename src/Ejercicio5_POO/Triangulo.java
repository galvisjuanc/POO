package Ejercicio5_POO;

/** @author galvi
 * Ejercicio 5: Diseñar un programa para trabajar con triángulos is´sceles. Para ello, defina los atributos necesarios
 * que se requieren (base, altura o lado corto y lado largo), proporciona métodos de consulta, un método constructor e
 * implemente métodos para calcular el perímetro y el área de un triángulo, además implementar un método que apartir de
 * un arreglo de triángulos, devuelva el área del triángulo de mayor superficie.
 *** Objeto --> Triángulo con método constructor
 *** Atributos --> base, lado, de tipo double. Se encapsulan porque son privados.
 *** Métodos: obtenerPerimetro(): double, obtenerArea(): double, mostrarDatos(): double
 */
public class Triangulo {
    private double base;
    private double lado;

    //Constructor
    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    //Metodos Getters y Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Método Perimetro, Área y MostrarDatos
    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }

    public double obtenerArea(){
        double area = (base*Math.sqrt((getLado()*getLado()) - ((getBase()*getBase())/4)))/2;
        return area;
    }

    public String mostrarDatos(){
        return "Base: "+getBase()+"\nLado: "+getLado()+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
    }
}
