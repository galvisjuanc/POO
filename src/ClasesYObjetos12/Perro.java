package ClasesYObjetos12;

public class Perro extends Animal{

    @Override
    public void comer() {
        System.out.println("Estoy comiendo con mi platito en el suelo!");
    }

    // Si yo comento este método, saldrá el del método padre
}
