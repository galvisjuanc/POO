package Ejercicio1_POO;

import java.util.Scanner;

/** @author galvi
 * Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus
 * dos lados. Los valores de la longitud deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará
 * la longitud de uno de los lados, al constructor.
 *** Objeto --> Cuadrilatero (Cuadrado, rectángulo, rombo, trapezio, etc.). Serían dos constructores. Uno que requiera los
 *** dos lados (si es un cuadrilatero diferente a un cuadrado) y otro que solo pida un lado (en el caso de un cuadrado)
 *** Atributos --> lados. lado1 y lado2, de tipo float.
 *** Métodos: área, perímetro. Los argumentos serán los lados para calcular.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float l1, l2;
        Cuadrilatero c1;
        System.out.print("Digite el valor del primer lado del cuadrilatero: ");
        l1 = entrada.nextFloat();
        System.out.print("Digite el valor del segundo lado del cuadrilatero: ");
        l2 = entrada.nextFloat();

        if(l1 != l2) {
            c1 = new Cuadrilatero(l1, l2);
        }
        else{
            c1 = new Cuadrilatero(l1);
        }

        System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
        System.out.println("El área del cuadrilatero es: "+c1.getArea());

    }
}
