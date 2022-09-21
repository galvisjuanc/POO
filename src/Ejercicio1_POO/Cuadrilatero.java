package Ejercicio1_POO;

public class Cuadrilatero {

    /*Atributos*/
    private float lado1;
    private float lado2;

    /*Método constructor Cuadrilatero no Cuadrado*/
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /*Método constructor Cuadrilatero Cuadrado*/
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    /*Getters*/
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    /*Metodos del cuadrado*/
    public float getPerimetro(){
        float Perimetro = 2*(getLado1() + getLado2());
        return Perimetro;
    }

    public float getArea(){
        float Area;
        Area = (getLado1() * getLado2());
        return Area;
    }

}
