package src;

public class Main {
    public static void main(String[] args) {
        Luchador luchador1 = new Luchador(300, 15);

        System.out.println("Es Chuck Norris: " + luchador1.esChuckNorris(700));
        System.out.println("Es insecto: " + luchador1.esInsecto());
        luchador1.entrenar(10);
        System.out.println("Fuerza después de entrenar: " + luchador1.getFuerzaCombate());
        System.out.println("Energía después de entrenar: " + luchador1.getEnergia());

        luchador1.dormir();
        System.out.println("Energía después de dormir: " + luchador1.getEnergia());
    }
}
