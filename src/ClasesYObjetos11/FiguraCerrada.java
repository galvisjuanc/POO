package ClasesYObjetos11;

/** final public class FiguraCerrada extends Figura. Si coloco final a la clase, la clase Cuadrado no podría existir porque
 *  FiguraCerrada no permite que hereden nada de ella. */

public class FiguraCerrada extends Figura {

    private int nLados;

    public FiguraCerrada(double tamaño, int nLados) {
        super(tamaño);
        this.nLados = nLados;
    }

    // public final void dibujar(){     // Esto muestra que el método no se puede heredar de las clases hijas.
    public void dibujar(){
        System.out.println("Dibujo de una figura cerrada");
    }
}
