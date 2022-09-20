package ClasesYObjetos3;

import javax.swing.*;

public class Source {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo número"));

        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        op.mostrarResultados();
    }
}
