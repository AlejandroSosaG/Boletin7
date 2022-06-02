package principal.Ejercicio1;
enum MarcaDeVehiculo{BMW, MERCEDES,
    AVENSIS, TOYOTA, SEAT, NISSAN, AUDI, NO_EXISTE}
public class Vehiculo {

   private MarcaDeVehiculo marca;
        String matricula;
        public Vehiculo(){

        }
        public Vehiculo (MarcaDeVehiculo marca, String matricula){
            this.matricula=matricula;
            this.marca=marca;
        }
    public MarcaDeVehiculo getMarca() {
        return marca;
    }
    public void setMarca(String marca1) {
        switch (marca1){
            case "BMW":
                this.marca=MarcaDeVehiculo.BMW;
                break;
            case"MERCEDES":
                this.marca=MarcaDeVehiculo.MERCEDES;
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
            default:  marca=MarcaDeVehiculo.NO_EXISTE;
        }
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
