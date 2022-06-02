package principal.Ejercicio8;

public class Punto {
        private double x,y;
        public Punto (double a, double b){
            this.x = a;
            this.y = b;
        }
        public double getX(){
            return this.x;
        }
        public double gety(){
            return this.y;
        }
        public void setX(double a){
            this.x=a;
        }
        public void setY(double b){
            this.y=b;
        }
        public boolean igual(Punto p){
            boolean result=false;
            if (this.x==p.x && this.y==p.y){
                result=true;
            }
            return result;
        }
        public double distanciaAlOrigen() {
            double result = Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
            System.out.println("x al cuadrado es " + Math.pow((this.x),2));
            return result;
        }
        public double distanciaAlOrigen(Punto z) {
            double result = Math.sqrt(Math.pow((this.x-z.x),2) + Math.pow((this.y- z.y),2));
            return result;
        }
        public String toString(){
            String display;
            return display = "la cordenada X es: "+this.x+ " la coordenada y es:"+ this.y;
        }

}
