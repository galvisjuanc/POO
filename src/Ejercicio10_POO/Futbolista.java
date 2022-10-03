package Ejercicio10_POO;

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

public class Futbolista extends Persona{

    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partido de futbol");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }

    public void entrevista(){
        System.out.println("El futbolista da una entrevista");
    }
}
