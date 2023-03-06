package ico.fes.unam;

public class PelotaDriver {
    public static void main(String[] args) {
        Pelota ball = new Pelota();
        System.out.println(ball);
        System.out.println(ball.movimiento());
        System.out.println(ball.flotar());
        System.out.println(ball.patear());
    }
}
