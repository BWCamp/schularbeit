package Einstieg_OOP;

public class Kreis {
    int positionX, positionY, radius;
    String farbe;

    Kreis() {

    }

    Kreis(int positionX, int positionY, int radius, String farbe) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.radius = radius;
        this.farbe = farbe;
    }

    public void verschieben(int xRichtung, int yRichtung) {
        positionX += xRichtung;
        positionY += yRichtung;
    }

    public void vergroessern(int zusaetzlicherRadius) {
        radius += zusaetzlicherRadius;
    }

    public double flaecheninhaltBerechnen() {
        return Math.PI * (radius * radius);
    }

    public double umfangBerechnen() {
        return 2 * Math.PI * radius;
    }
}
