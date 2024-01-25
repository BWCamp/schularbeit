package Einstieg_OOP;

public class Rechteck {
    int positionX, positionY, breite, hoehe;
    String farbe;

    // Nicht sichtbar: leer- und default- Konstruktor

    Rechteck() {

    }
    Rechteck(int positionX, int positionY, int breite, int hoehe, String farbe) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.farbe = farbe;
        this.breite = breite;
        this.hoehe = hoehe;
    }
}
