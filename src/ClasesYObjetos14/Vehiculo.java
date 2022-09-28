package ClasesYObjetos14;

/**
 *                                                 Vehículo
 *                                            # matricula: String
 *                                            # marca: String
 *                                            # modelo: String
 *                                          + mostrarDatos(): String
 *
 *          VehículoTurismo                   VehículoDeportivo                    VehículoFurgoneta
 *       - numeroPuertas: int                 - cilindrada: int                     - carga : int
 *     + mostrarDatos(): String            + mostrarDatos(): String            + mostrarDatos(): String
 * */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String mostrarDatos(){
        return "Matricula: " +getMatricula()+
                "\nMarca: "+getMarca()+
                "\nModelo: "+getModelo();
    }
}
