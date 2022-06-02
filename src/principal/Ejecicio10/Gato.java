package principal.Ejecicio10;

public class Gato {
    String nombre, color, raza;
    int edad;
    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }
    public Gato() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void compareTo(Gato gato2){
        Gato gato= new Gato();
        gato.setEdad(edad);
        if (Integer.compare(gato.getEdad(), gato2.getEdad())>0){
            System.out.println("El primer gato es mayor");
        }else if (Integer.compare(gato.getEdad(), gato2.getEdad())==0){
            System.out.println("Los dos gatos tienen la misma edad");
        }else {
            System.out.println("El segundo gato es mayor");
        }
    }
    public void compareTo2(Gato gato2) {
        Gato gato=new Gato();
        gato.setNombre(nombre);
        if (gato.getNombre().compareTo(gato2.getNombre())<0){
            System.out.println("El nombre del primer gato va antes");
        }else if (gato.getNombre().compareTo(gato2.getNombre())==0){
            System.out.println("Los dos gatos tienen el mismo nombre");
        }else {
            System.out.println("El nombre del segundo gato va antes");
        }
    }
}
