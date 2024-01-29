package Einstieg_OOP;

import ack.shapes.Leinwand;

public class MethodenTest {
    public static void main(String[] args){
        Rechteck rechteck1 = new Rechteck(100, 200, 50, 100, "blau");

        System.out.println(rechteck1.istQuadrat());
        System.out.println(rechteck1.flaecheninhaltBerechnen());
        System.out.println(rechteck1.umfangBerechnen());

        Leinwand leinwand = new Leinwand();

        leinwand.zeichne(rechteck1); // Zeichnen des Rechtecks vor Methodenaufruf
/*        rechteck1.verschieben(100,100); // Ausführen der Methode
        leinwand.warte(2000); // Warte 2 Sekunden
        leinwand.zeichne(rechteck1); // Zeichnen des Rechtecks nach der Veränderung
        rechteck1.vergroessern(2);
        leinwand.warte(2000);
        leinwand.zeichne(rechteck1);
        rechteck1.hoeheBreiteVertauschen();*/
        rechteck1.um90GradDrehen();
        leinwand.warte(1000);
        leinwand.zeichne(rechteck1);
        rechteck1.um90GradDrehen();
        leinwand.warte(1000);
        leinwand.zeichne(rechteck1);
        rechteck1.um90GradDrehen();
        leinwand.warte(1000);
        leinwand.zeichne(rechteck1);
        rechteck1.um90GradDrehen();
        leinwand.warte(1000);
        leinwand.zeichne(rechteck1);
    }
}
