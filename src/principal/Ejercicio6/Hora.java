package principal.Ejercicio6;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int h, int m, int s){
        this.horas=h;
        this.minutos= m;
        this.segundos=s;
    }
    public void muestraFecha(int segundos) {
        this.suma();
        System.out.println("Son las: "+ this.horas+ ":"+ this.minutos +":"+ this.segundos);

    }
    private void suma() {
        this.segundos += 1;
        if (this.segundos>59) {
            this.segundos = 0;
            this.minutos += 1;
            if (this.minutos>59){
                this.minutos=0;
                this.horas +=1;
                if (this.horas>23) {
                    this.horas = 0;
                }
            }
        }
    }
}
