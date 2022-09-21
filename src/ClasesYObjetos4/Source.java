package ClasesYObjetos4;

import javax.swing.*;

public class Source {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo número"));

        Operacion op1 = new Operacion();

        int suma, resta, multiplicacion;
        float division;

        suma = op1.sumar(n1, n2);
        resta = op1.restar(n1, n2);
        multiplicacion = op1.multiplicar(n1, n2);
        division = op1.dividir(n1, n2);

        op1.mostrarResultados(suma, resta, multiplicacion, division);
    }
}
