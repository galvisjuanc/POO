package ClasesYObjetos8;

public class Principal {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan Camilo", 30);

        persona1.mostrarDatos();

        //Pasaron dos años

        persona1.setEdad(32);
        persona1.mostrarDatos();

        //El nombre no se puede cambiar porque es un valor final, un valor constante
    }
}
