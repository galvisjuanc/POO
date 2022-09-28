package ClasesYObjetos13;

public class Principal {

    public static void main(String[] args) {
        //SerVivo serVivo = new SerVivo(); //Si se hace esto, existe un error porque serVivo es una clase abstracta y no deja instanciar objetos

        Planta planta = new Planta();
        planta.alimentarse();

        //Animal animal = new Animal(); //Si se hace esto, existe un error porque Animal es una clase abstracta y no deja instanciar objetos

        AnimalCarnivoro animalC = new AnimalCarnivoro();
        animalC.alimentarse();

        AnimalHerbivoro animalH = new AnimalHerbivoro();
        animalH.alimentarse();
    }
}
