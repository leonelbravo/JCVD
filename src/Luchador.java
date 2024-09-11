package src;

public class Luchador {
    public int fuerzaCombate;
    public int energia;
    public static final double CONSTANTE_VAN_DAMME = 1.2;

    public Luchador(int fuerzaCombate, int energia) {
        this.fuerzaCombate = fuerzaCombate;
        this.energia = energia;
    }

    public boolean esChuckNorris(double valorDeCorte) {
        return (this.fuerzaCombate * CONSTANTE_VAN_DAMME > valorDeCorte) && (this.energia > 15);
    }

    public boolean esInsecto() {
        return this.fuerzaCombate < 500;
    }

    public void entrenar(int horas) {
        this.fuerzaCombate += (int) (0.5 * horas);
        this.energia -= 20;
    }

    public void dormir() {
        this.energia += 20;
    }

    public double getFuerzaCombate() {
        return fuerzaCombate;
    }

    public int getEnergia() {
        return energia;
    }

    public void setFuerzaCombate(int fuerzaCombate) {
        this.fuerzaCombate = fuerzaCombate;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}