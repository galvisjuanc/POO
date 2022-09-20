package ClasesYObjetos3;

import javax.swing.*;

public class Operacion {

    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos

    //Método que suma
    public void sumar(int num1, int num2){
        suma = num1 + num2;
    }

    //Método que resta
    public void restar(int num1, int num2){
        resta = num1 - num2;
    }

    //Método que multiplica
    public void multiplicar(int num1, int num2){
        multiplicacion = num1 * num2;
    }

    //Método que divide
    public void dividir(int num1, int num2){
        division = num1 / num2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
