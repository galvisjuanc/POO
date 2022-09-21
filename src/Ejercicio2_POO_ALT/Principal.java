package Ejercicio2_POO_ALT;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;
        int x,y, opcion, incremento = 0;

        System.out.print("Digite la coordenada inicial de X: ");
        x = entrada.nextInt();
        System.out.print("Digite la coordenada inicial de Y: ");
        y = entrada.nextInt();

        //posicion inicial del objeto
        t1 =  new Tablero(x, y);

        do{
            System.out.println("\n\t. : MENU:.");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");
            System.out.print("Digite la opción: ");
            opcion = entrada.nextInt();

            if(opcion != 5){
                System.out.print("\nDigite la cantidad de espacios a moverse: ");
                incremento = entrada.nextInt();
            }

            switch (opcion){
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("Error, se equivocó de opción de menú"); break;
            }
            System.out.println("\nPosicion Actual (X,Y): ("+t1.getX()+","+t1.getY()+")");
        }
        while(opcion != 5);
    }
}
