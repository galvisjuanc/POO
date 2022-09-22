package Ejercicio3_POO;

import javax.swing.*;
import java.util.Scanner;

/** @author galvi
 * Ejercicio 3: Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio, se
 * imprima las propiedades del vehiculo más barato. Para ello, se deberán leer por teclado las características de cada
 * vehículo y crear una clase que represente a cada uno de ellos.
 *** Objeto --> Vehículo con un solo Constructor. Se puede crear un arreglo de objetos.
 *** Atributos --> Marca, Modelo y Precio. Se encapsulan
 *** Métodos: getPrecio(): float, mostrarDatos(String)
 */
public class Principal {

    public static int indiceVehiculoMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
            
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vehiculo vehiculo[];
        int cantidad, indiceBarato;
        String marca, modelo;
        float precio;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vehiculos que desea analizar: "));
        vehiculo = new Vehiculo[cantidad];

        System.out.println("Digite ahora las características de cada uno de los vehículos: ");
        for (int i = 0; i < vehiculo.length; i++) {
            entrada.nextLine();
            System.out.println("\nVehiculo "+(i+1)+"");
            System.out.print("Marca: ");
            marca = entrada.nextLine();
            System.out.print("Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Precio: $");
            precio = entrada.nextFloat();

            vehiculo[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceVehiculoMBarato(vehiculo);
        System.out.println("\nEl coche más barato tiene las siguientes características: ");
        System.out.println(vehiculo[indiceBarato].mostrarDatos());
    }
}
