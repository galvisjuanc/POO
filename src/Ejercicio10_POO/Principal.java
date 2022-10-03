package Ejercicio10_POO;

import java.util.ArrayList;
import java.util.Scanner;

/** Ejercicio 10: Crear un programa para simular un equipo de futbol(futbolista, entrenador y doctor), para lo cuál:
 * Una super clase Persona, que tendrá los siguientes datos: nombre, apellido, edad
 * Sub clase Futbolista que tendrá los siguientes datos: dorsal y posición.
 * Sub clase Entrenador que tendrá de dato la estrategia que utiliza.
 * Sub clase Doctor que tendrá la titulación y los años de experiencia.
 *
 * Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento, partido de futbol, planificar
 * entrenamiento, entrevista, curar lesión.
 *
 * Clase Padre: Persona (abstract)
 * Atributos: # nombre: String, # apellidos: String, # edad: int.
 * Métodos: + viajar(): void, + partidoFutbol(): void [abstract], + entrenamiento(): void [abstract]
 *
 * Futbolista: Atributos (-dorsal: int, -posición: String) y Métodos: (+ entrevista(): void)
 * Entrenador: Atributos (- estrategia: String) y Métodos (+ planificarEntrenamiento(): void)
 * Médico: Atributos (- titulación: string, - añosExperiencia: int) y Métodos (+ curarLesion(): void).
 * */

public class Principal {
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    static Persona futbolista1 = new Futbolista("Douglas David", "Rodriguez Cuéllar", 26, 9, "Delantero");
    static Persona futbolista2 = new Futbolista("Dicken Santiago","Barrera Cuéllar", 22, 7, "Defensa");
    static Persona entrenador = new Entrenador("María Fernanda", "Galvis Cuéllar", 25, "Divide y Vencerás");
    static Persona doctor1 = new Doctor("María José", "Galvis Cuéllar", 14, "Licenciada en Fisioterapia", 2);

    static Scanner entrada = new Scanner(System.in);



    public static void main(String[] args) {

        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(doctor1);

        menu();//menú

    }

    public static void menu(){

        int opcion;
        do{
            System.out.println("\t\n.:MENU:.");
            System.out.println("1. Viaje de Equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.print("Opción a elegir: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1: // Viaje de equipo
                    System.out.println("");
                    viajarEquipo();
                    break;
                case 2: // Entrenamiento
                    System.out.println("");
                    entrenarEquipo();
                    break;
                case 3: // Partido de Futbol
                    System.out.println("");
                    partidoFutbol();
                    break;
                case 4: //Planificar un Entrenamiento
                    System.out.println("");
                    planificarEntrene();
                    break;
                case 5: // Entrevista
                    System.out.println("");
                    darEntrevista();
                    break;
                case 6: // Curar Lesión
                    System.out.println("");
                    lesionCurada();
                    break;
                case 7: // Salir
                    System.out.println("Fin del programa!");
                    break;
                default:
                    System.out.println("Error, se equivocó de opción de menú. Intentelo de nuevo");
                    break;
            }
        }
        while(opcion != 7);
    }

    public static void viajarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrene(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }

    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
        ((Futbolista)futbolista1).entrevista();

        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
        ((Futbolista)futbolista2).entrevista();
    }

    public static void lesionCurada(){
        System.out.print(doctor1.getNombre()+" "+doctor1.getApellido()+" -> ");
        ((Doctor)doctor1).curarLesion();
    }
}
