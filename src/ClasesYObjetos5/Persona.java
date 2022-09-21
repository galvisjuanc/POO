package ClasesYObjetos5;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //El primer método que se suele crear, es el método constructor.

/*    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }*/

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
