package ClasesYObjetos16;

public class MusicoEstudiante implements Musico, Estudiante{

    @Override
    public void hablar() {
        System.out.println("Estoy hablando español");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Estoy tocando la guitarra");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando programación");
    }
}
