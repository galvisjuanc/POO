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

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void viajar(){
        System.out.println("Viajar");
    }

    public abstract void partidoFutbol();

    public abstract void entrenamiento();
}
