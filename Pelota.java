package ico.fes.unam;

import org.w3c.dom.css.RGBColor;

import java.util.Scanner;

public class Pelota {
    private float tamanio;
    private RGBColor color;
    private String material;
    private String flexibilidad;
    private boolean rebotes;

    public Pelota() {
    }

    public Pelota(float tamanio, RGBColor color, String material, String flexibilidad, boolean rebotes) {
        this.tamanio = tamanio;
        this.color = color;
        this.material = material;
        this.flexibilidad = flexibilidad;
        this.rebotes = rebotes;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public RGBColor getColor() {
        return color;
    }

    public void setColor(RGBColor color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFlexibilidad() {
        return flexibilidad;
    }

    public void setFlexibilidad(String flexibilidad) {
        this.flexibilidad = flexibilidad;
    }

    public boolean getRebotes() {
        return rebotes;
    }

    public void setRebotes(boolean rebotes) {
        this.rebotes = rebotes;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "tamanio=" + tamanio +
                ", color=" + color +
                ", material='" + material + '\'' +
                ", flexibilidad='" + flexibilidad + '\'' +
                ", rebotes=" + rebotes +
                '}';
    }
    public boolean movimiento(){
        System.out.println("La pelota se está moviendo? <-");
        boolean resultado = Math.random() <= 58.3;
        return resultado;
    }
    public boolean flotar(){
        System.out.println("La pelota está flotando? :0");
        boolean resultado = Math.random() >= 5.8;
        return resultado;
    }
    public String patear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres patear la pelota? respode con si o no: ");
        String respuesta = sc.nextLine();
        System.out.println("¿Pateaste la pelota?: ");
        return respuesta;
    }
}
