package principal.Ejercicio2;
enum MarcaDeVehiculo{BMW, MERCEDES,
    AVENSIS, TOYOTA, SEAT, NISSAN, AUDI}

public class Vehiculo2 {
    private MarcaDeVehiculo marca;
    String matricula;
    public MarcaDeVehiculo getMarcaString() {
        return marca;
    }
    public void setMarca(String marca1) {
        switch (marca1){
            case "BMW":
                marca=MarcaDeVehiculo.BMW;
                break;
            case"MECEDES":
                marca=MarcaDeVehiculo.MERCEDES;
                break;
            case "AVENSIS":
                marca=MarcaDeVehiculo.AVENSIS;
                break;
            case "TOYOTA":
                marca=MarcaDeVehiculo.TOYOTA;
                break;
            case "SEAT":
                marca=MarcaDeVehiculo.SEAT;
                break;
            case "NISSAN":
                marca=MarcaDeVehiculo.NISSAN;
                break;
            case "AUDI":
                marca=MarcaDeVehiculo.AUDI;
                break;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula1) {
        this.matricula = matricula1;
    }
}
