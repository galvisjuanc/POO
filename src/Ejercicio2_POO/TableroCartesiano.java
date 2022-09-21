package Ejercicio2_POO;

public class TableroCartesiano {

    private int x;
    private int y;

    public TableroCartesiano(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moverArriba(int incremento){
        System.out.println("Posicion actual: (X,Y) -> ("+getX()+","+getY()+")");
        int movimiento;
        movimiento = getY()+incremento;
        setY(movimiento);
        System.out.println("Dirección elegida: Arriba");
        System.out.println("Posición nueva: (X,Y) -> ("+getX()+","+getY()+")");
    }

    public void moverAbajo(int incremento){
        System.out.println("Posicion actual: (X,Y) -> ("+getX()+","+getY()+")");
        int movimiento;
        movimiento = getY()-incremento;
        setY(movimiento);
        System.out.println("Dirección elegida: Abajo ");
        System.out.println("Posición nueva: (X,Y) -> ("+getX()+","+getY()+")");
    }

    public void moverDerecha(int incremento){
        System.out.println("Posicion actual: (X,Y) -> ("+getX()+","+getY()+")");
        int movimiento;
        movimiento = getX()+incremento;
        setX(movimiento);
        System.out.println("Dirección elegida: Derecha --> ");
        System.out.println("Posición nueva: (X,Y) -> ("+getX()+","+getY()+")");
    }

    public void moverIzquierda(int incremento){
        System.out.println("Posicion actual: (X,Y) -> ("+getX()+","+getY()+")");
        int movimiento;
        movimiento = getX()-incremento;
        setX(movimiento);
        System.out.println("Dirección elegida: Izquierda <-- ");
        System.out.println("Posición nueva: (X,Y) -> ("+getX()+","+getY()+")");
    }
}
