package ClasesYObjetos9;

public class Estatico {

    private String frase = "Primera Frase";
    private static String frase1 = "Tercera Frase";

    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {

        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase = "Segunda Frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);

        Estatico ob3 = new Estatico();
        System.out.println(ob3.frase1);

        Estatico ob4 = new Estatico();
        ob4.frase1 = "Cuarta Frase";

        System.out.println("\n"+ob3.frase1);
        System.out.println(ob4.frase1);

        System.out.println("Aqui va el atributo de la clase: "+Estatico.frase1);
        System.out.println("Suma: "+Estatico.sumar(5, 5));
    }
}
