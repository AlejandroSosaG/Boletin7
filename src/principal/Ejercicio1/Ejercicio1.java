package principal.Ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // write your code here
        Scanner s= new Scanner(System.in);
        Vehiculo vehiculo1=new Vehiculo();
        System.out.println("marca = "+ vehiculo1.getMarca());
        System.out.println("matricula = "+ vehiculo1.getMatricula());

        Vehiculo vehiculo2= new Vehiculo (MarcaDeVehiculo.AUDI, "124687");
        System.out.println("marca = "+ vehiculo2.getMarca());
        System.out.println("matricula = "+ vehiculo2.getMatricula());

        Vehiculo vehiculo3=new Vehiculo();
        String marca;
        String matricula;
        System.out.println("Diga la matricula del vehiculo");
        matricula=s.next();
        vehiculo3.setMatricula(matricula);
        System.out.println("Diga la marca del vehiculo(Ford,Toyota,Suzuki,Renault,Seat).");
        marca = s.next();
        vehiculo3.setMarca(marca);
        System.out.println("marca = "+ vehiculo3.getMarca());
        System.out.println("matricula = "+ vehiculo3.getMatricula());

    }
}

