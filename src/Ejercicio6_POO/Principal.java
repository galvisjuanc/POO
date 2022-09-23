package Ejercicio6_POO;

import java.util.Scanner;

/** @author galvi
 * Ejercicio 6: Construir un programa para trabajar con dos números completos. Implementar el siguiente menú:
 * 1. Sumar dos números complejos. 2. Multiplicar dos números completos. 3 Comparar (iguales o no). 4. Multiplicar un
 * número completo por un entero.
 *** Objeto --> Número complejo (un solo constructor que tenga parte real y parte imaginaria).
 *** Atributos --> real (double), imaginaria (double con nomenclatura).
 *** Métodos: sumarComplejos(Complejo c), multiplicarComplejos(Complejo c), compararComplejos(boolean),
 *** MultiplicarEnteroComplejo(Complejo c), getA(), getB()
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo num1, num2, suma, mult;
        double a, b, c, d;      // num1 = a + bi, num2 = c + di
        int opcion, numeroentero;

        do{
            System.out.println("\t\n. :Operaciones con Números Complejos:.");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comparar 2 números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("\nDigite la opción de menú: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    num1 = new NumeroComplejo(a,b);

                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    num2 = new NumeroComplejo(c,d);

                    suma = num1.calcularSuma(num2);
                    System.out.println("\nLa suma de los dos números complejos es: "+suma.getA() + " + "+suma.getB()+"i");
                    break;

                case 2:
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    num1 = new NumeroComplejo(a,b);

                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    num2 = new NumeroComplejo(c,d);

                    mult = num1.calcularMultiplicacion(num2);
                    System.out.println("\nLa multiplicación de los dos números complejos es: "+mult.getA() + " + "+mult.getB()+"i");
                    break;

                case 3:
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    num1 = new NumeroComplejo(a,b);

                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    num2 = new NumeroComplejo(c,d);

                    if(num1.comprobarIgualdad(num2)){
                        System.out.println("\nLos números complejos son iguales");
                    }
                    else{
                        System.out.println("\nLos números complejos no son iguales");
                    }
                    break;
                case 4:
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    num1 = new NumeroComplejo(a,b);
                    System.out.print("Ahora digite el número entero: ");
                    numeroentero = entrada.nextInt();

                    mult = num1.multiplicarPorEntero(numeroentero);
                    System.out.println("\nLa multiplicación del complejo con el entero es: "+mult.getA() + " + "+mult.getB()+"i");
                    break;

                case 5: break;

                default:
                    System.out.println("La opción digitada no es válida. Intentelo de nuevo.");
                    break;
            }
        }
        while(opcion != 5);
        System.out.println("Fin del programa");
    }
}
