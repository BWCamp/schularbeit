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

    public void verschieben(int xRichtung, int yRichtung) {
        positionX += xRichtung;
        positionY += yRichtung;
    }

    public double flaecheninhaltBerechnen() {
        return breite * hoehe;
    }

    public void vergroessern(int faktor) {
        hoehe *= faktor;
        breite *= faktor;
    }

    public double umfangBerechnen() {
        return (breite * 2) + (hoehe * 2);
    }

    public boolean istQuadrat() {
        return breite == hoehe;
    }

    public void hoeheBreiteVertauschen() {
        int tempHoehe = hoehe;
        hoehe = breite;
        breite = tempHoehe;
    }

    public void um90GradDrehen() {
        double centerx = (positionX + .5 * breite);
        double centery = (positionY + .5 * hoehe);
        this.hoeheBreiteVertauschen();
        this.positionX = (int) (centerx - .5 * breite);
        this.positionY = (int) (centery - .5 * hoehe);
    }
}