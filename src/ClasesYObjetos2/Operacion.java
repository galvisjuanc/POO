package ClasesYObjetos2;

import javax.swing.*;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos

    //Método para pedirle al usuario que digite 2 números
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo número: "));
    }

    //Método que suma
    public void sumar(){
        suma = numero1 + numero2;
    }

    //Método que resta
    public void restar(){
        resta = numero1 - numero2;
    }

    //Método que multiplica
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }

    //Método que divide
    public void dividir(){
        division = numero1 / numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }

}
