package principal.Ejercicio8;

public class Main8 {
    public static void main (String args[]) {
        Punto punto = new Punto(5, 25);
        System.out.println(punto);
        System.out.println("La cordenada X es: "+ punto.getX()+
                " y la coordenada y es:"+ punto.gety());
        System.out.println("La distancia del punto al origen es = "+ punto.distanciaAlOrigen());
        System.out.println("La distancia de mi punto al punto (25,50) es = "
                + punto.distanciaAlOrigen(new Punto(25,50)));
    }
}
