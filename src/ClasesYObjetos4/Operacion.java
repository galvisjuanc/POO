package ClasesYObjetos4;

public class Operacion {

    //Métodos. Para este caso, no se declaran atributos

    //Método que suma
    public int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    //Método que resta
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }

    //Método que multiplica
    public int multiplicar(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    //Método que divide
    public float dividir(int num1, int num2){
        float division = num1 / num2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, float division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
