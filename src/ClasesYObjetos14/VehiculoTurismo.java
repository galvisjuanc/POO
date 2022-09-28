package ClasesYObjetos14;

public class VehiculoTurismo extends Vehiculo{

    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas(){
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " +getMatricula()+
                "\nMarca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nNúmero de Puertas:"+getnPuertas();
    }
}
