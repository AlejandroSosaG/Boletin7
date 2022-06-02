package principal.Ejercicio5;

public class Sintonizador {
    static final double SALTO = 0.5;
    static final double FRECUENCIAMAX= 108;
    static final double FRECUENCIAMIN = 80;
    private double frecuencia;
    public Sintonizador(){
        this.frecuencia= FRECUENCIAMIN;
    }
    public void up(){
        this.frecuencia += SALTO;
        if (this.frecuencia > FRECUENCIAMAX){
            this.frecuencia= FRECUENCIAMIN;
        }
    }
    public void down(){
        this.frecuencia -= SALTO;
        if (this.frecuencia < FRECUENCIAMIN){
            this.frecuencia=FRECUENCIAMAX;
        }
    }
    public String toString(){
        String display;
        display = "La frecuencia actual es: "+ this.frecuencia;
        return display;
    }
}
