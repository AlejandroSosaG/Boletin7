package principal.Ejercicio2;
import principal.Ejercicio1.Vehiculo;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // write your code here
        Scanner s= new Scanner(System.in);
        Vehiculo vehiculo= new Vehiculo();
        String marca;
        String matricula;
        System.out.println("Diga la matricula del vehiculo");
        matricula=s.next();
        vehiculo.setMatricula(matricula);
        System.out.println("Diga la marca del vehiculo(Ford,Toyota,Suzuki,Renault,Seat).");
        marca = s.next();
        vehiculo.setMarca(marca);
    }
}
