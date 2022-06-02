package principal.Ejercicio6;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main6 {
    public static void main(String args[]) {
        GregorianCalendar fechaHoy = new GregorianCalendar();
        int segundos = 0;
        Scanner teclado = new Scanner(System.in);
        boolean v = false;
        while (!v) {
            try {
                System.out.println("Introduzca los segundos, para salir, un 0");
                segundos = teclado.nextInt();
                if (segundos >= 0) {
                    v = true;
                }
            } catch (Exception e) {
                System.out.println("El valor de minutos es incorrecto");
                teclado.nextLine();
            }
        }
        if (segundos > 0) {
            Hora fecha = new Hora(fechaHoy.get(Calendar.HOUR_OF_DAY), fechaHoy.get(Calendar.MINUTE),
                    fechaHoy.get(Calendar.SECOND));
            for (int i = 1; i <= segundos; i++) {
                fecha.muestraFecha(segundos);
            }
        }
    }
}
