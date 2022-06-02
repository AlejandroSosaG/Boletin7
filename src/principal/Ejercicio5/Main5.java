package principal.Ejercicio5;

public class Main5 {
    public static void main(String[] args) {
        // write your code here
        Sintonizador sintonizador = new Sintonizador();
        System.out.println("subimos el sintonizador");
        sintonizador.up();
        System.out.println(sintonizador);
        System.out.println("bajamos el sintonizador");
        sintonizador.down();
        System.out.println(sintonizador);
        System.out.println("bajamos el sintonizador otra vez, tiene que ponerse a la máxima frecuencia");
        sintonizador.down();
        System.out.println(sintonizador);
        System.out.println("subimos el sintonizador, tiene que ponerse a la mínima frecuencia");
        sintonizador.up();
        System.out.println(sintonizador);
    }
}
