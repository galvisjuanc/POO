package Ejercicio5_POO;

import java.util.Scanner;

/** @author galvi
 * Ejercicio 5: Diseñar un programa para trabajar con triángulos is´sceles. Para ello, defina los atributos necesarios
 * que se requieren (base, altura o lado corto y lado largo), proporciona métodos de consulta, un método constructor e
 * implemente métodos para calcular el perímetro y el área de un triángulo, además implementar un método que apartir de
 * un arreglo de triángulos, devuelva el área del triángulo de mayor superficie.
 *** Objeto --> Triángulo con método constructor
 *** Atributos --> base, lado, de tipo double. Se encapsulan porque son privados.
 *** Métodos: obtenerPerimetro(): double, obtenerArea(): double, mostrarDatos(): double
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulos[];
        int cantidadTriangulos, indiceTrianguloArea;
        double base, lado;

        System.out.print("Digite la cantidad de triangulos a revisar: ");
        cantidadTriangulos = entrada.nextInt();
        triangulos = new Triangulo[cantidadTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores del Triangulo "+(i+1)+".");
            System.out.print("Base: ");
            base = entrada.nextDouble();
            System.out.print("Lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Triangulo(base, lado);
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }

        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    }

    public static double mayorArea(Triangulo triangulos[]){
        double area;

        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
}
