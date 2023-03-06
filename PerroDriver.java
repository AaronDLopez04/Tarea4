package ico.fes.unam;

public class PerroDriver {
    public static void main(String[] args) {
        Perro dog = new Perro();
        System.out.println(dog);
        System.out.println(dog.caminar());
        System.out.println(dog.trucos());
        System.out.println(dog.comer());
    }
}
