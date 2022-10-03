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

public class Doctor extends Persona{

    private String titulacion;
    private int añosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Da asistencia en un partido de Futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia en un entrenamiento");
    }

    public void curarLesion(){
        System.out.println("Lesion curada");
    }
}
