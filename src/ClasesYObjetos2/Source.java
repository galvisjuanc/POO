package ClasesYObjetos2;

public class Source {
    public static void main(String[] args) {

        Operacion op = new Operacion();     // Objeto creado

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
