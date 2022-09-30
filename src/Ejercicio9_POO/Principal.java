package Ejercicio9_POO;

import java.util.ArrayList;
import java.util.Scanner;

/** Ejercicio 9: Hacer un programa para calcular el área de Polígonos (triángulos y rectángulos). El programa debe ser
 * capaz de almacenar en un arreglo N, los triángulos y rectángulos, y al final debe mostrar el área y los datos de cada uno.
 * Para ello, se tendrá lo siguiente: Una super clase llamada Polígono, dos subclases llamadas Triángulo y Rectángulo.
 * Objetos: Polígono (Padre), Triángulo y Rectángulo (Hijos)
 * Atributos y Métodos:
 ** Poligono (abstract): #numeroLados: int, + toString(): String, + area(): double (abstract too)
 ** Rectángulo: -lado1: double, - lado2: double, + toString(): String, + area(): double.
 ** Triángulo: - lado1, lado2 y lado3: double,  + toString(): String, + area(): double.
 * */

public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();           // llenar un polígono
        mostrarResultados();        // mostrar datos de los polígonos
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite qué poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opción: ");

                opcion = entrada.nextInt();
            } while(opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: //llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: // llenar un rectángulo
                    llenarRectangulo();
                    break;
            }

            System.out.print("\nDesea introducir otro polígono (S/N): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while(respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo(){
        double l1, l2, l3;

        System.out.print("\nDigite el lado1 del triángulo: ");
        l1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triángulo: ");
        l2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triángulo: ");
        l3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(l1, l2, l3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double l1, l2;

        System.out.print("\nDigite el lado1 del rectángulo: ");
        l1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectángulo: ");
        l2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(l1, l2);
        poligono.add(rectangulo);
    }

    public static void mostrarResultados(){
        for (Poligono poli: poligono) {
            System.out.println(poli.toString());
            System.out.println("Area = "+poli.area());
            System.out.println("");
        }
    }
}
