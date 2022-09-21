package ClasesYObjetos7_2;

import ClasesYObjetos7_1.Clase1;

public class Clase3 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        //objeto1.atributo1 = 30;     //al hacerlo publico en la clase1, ya se puede llamar
        //objeto1.atributo2 = 40; // Aquí se genera un error porque el atributo no es publico para el paquete donde está
        objeto1.setAtributo1(30);
        objeto1.setAtributo2(20);
        objeto1.setAtributo3(10);

        System.out.println("El atributo1 es: "+objeto1.getAtributo1());
        System.out.println("El atributo2 es: "+objeto1.getAtributo2());
        System.out.println("El atributo3 es: "+objeto1.getAtributo3());
    }
}
