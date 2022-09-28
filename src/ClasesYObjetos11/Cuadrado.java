package ClasesYObjetos11;

public class Cuadrado extends FiguraCerrada{

    private double area;

    public Cuadrado(double tamaño, int nLados, double area) {
        super(tamaño, nLados);
        this.area = area;
    }

    public void dibujar(){
        System.out.println("Dibujo de un cuadrado");
    }
}
