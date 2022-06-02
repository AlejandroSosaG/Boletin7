package principal.Ejecicio10;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato gato = new Gato("Garfield", "naranja", "persa", 5);
        Gato gato2 = new Gato("Misifu", "Negro", "bengala", 3);
        gato.compareTo2(gato2);
        gato.compareTo(gato2);
    }
}
