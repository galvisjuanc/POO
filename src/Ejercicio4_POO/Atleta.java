package Ejercicio4_POO;

/** @author galvi
 * Ejercicio 4: Construir un programa para una competencia de atletismo. El programa debe gestionar una serie de atletas
 * caracterizados por su número de atleta, nombre y tiempo de carrera. Al final, el programa debe mostrar los datos del
 * atleta ganador de la carrera.
 *** Objeto --> Atletas en un arreglo. Un solo constructor con número de atleta, nombre y tiempo.
 *** Atributos --> Número de atleta, nombre y tiempo. Se encapsulan porque son privados.
 *** Métodos: getTiempo(): float, mostrarDatos(String)
 */
public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    //Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    //Métodos


    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "Número Atleta: "+getNumeroAtleta()+"\nNombre: "+getNombre()+"\nTiempo Carrera: "+getTiempoCarrera();
    }

}
