package ico.fes.unam;


import java.util.Scanner;

public class Perro {
    private String raza;
    private float tamanio;
    private byte edad;
    private String nombre;
    private String pelaje;

    public Perro() {
    }

    public Perro(String raza, float tamanio, byte edad, String nombre, String pelaje) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
        this.nombre = nombre;
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamanio=" + tamanio +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", pelaje='" + pelaje + '\'' +
                '}';
    }
    public boolean caminar(){
        System.out.println("Está caminando? <-");
    boolean resultado = Math.random() >= 25.9;
    return resultado;
    }
    public boolean trucos(){
        System.out.println("Hizo un truco? :)");
        boolean resultado = Math.random() < 10;
        return resultado;
    }
    public String comer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe qué le quieres dar de comer: ");
        String comer = sc.nextLine();
        System.out.println("El perro esta comiendo tu ");
        return comer;
    }
}
