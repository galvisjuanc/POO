package Ejercicio4_POO;

import Ejercicio3_POO.Vehiculo;

import java.util.Scanner;

/** @author galvi
 * Ejercicio 4: Construir un programa para una competencia de atletismo. El programa debe gestionar una serie de atletas
 * caracterizados por su número de atleta, nombre y tiempo de carrera. Al final, el programa debe mostrar los datos del
 * atleta ganador de la carrera.
 *** Objeto --> Atletas en un arreglo. Un solo constructor con número de atleta, nombre y tiempo.
 *** Atributos --> Número de atleta, nombre y tiempo. Se encapsulan porque son privados.
 *** Métodos: getTiempo(): float, mostrarDatos(String)
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceRapido;
        float tiempoCarrera;

        System.out.print("Digite el número de atletas a participar: ");
        nAtletas = entrada.nextInt();

        //Objetos instanciados.
        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < atletas.length; i++) {

            System.out.println("\nDigite los datos del atleta "+(i+1)+": ");
            System.out.print("Introduzca el número del atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        indiceRapido = indiceAtletaRapido(atletas);
        System.out.println("\nEl atletas ganador es: ");
        System.out.println(atletas[indiceRapido].mostrarDatosGanador());
    }

    public static int indiceAtletaRapido(Atleta competidores[]){
        float tiempomenor;
        int indice = 0;

        tiempomenor = competidores[0].getTiempoCarrera();
        for (int i = 1; i < competidores.length; i++) {
            if(competidores[i].getTiempoCarrera() < tiempomenor){
                tiempomenor = competidores[i].getTiempoCarrera();
                indice = i;
            }

        }
        return indice;
    }
}
