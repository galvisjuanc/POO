package ClasesYObjetos6;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Métodos
    //Constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Sobrecarga de constructores
    public Persona(String dni) {
        this.dni = dni;
    }

    //Sobrecarga de métodos
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+ "años y estoy corriendo una maratón");
    }

    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros...");
    }
}
