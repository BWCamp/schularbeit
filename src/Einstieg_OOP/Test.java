package Einstieg_OOP;
import ack.shapes.Leinwand;

public class Test {
    public static void main(String[] args) {
        Rechteck rechteck1 = new Rechteck();
        Kreis kreis1 = new Kreis();
        Leinwand leinwand = new Leinwand();

/*        System.out.println(rechteck1.positionX);
        System.out.println(rechteck1.positionY);
        System.out.println(rechteck1.breite);
        System.out.println(rechteck1.hoehe);
        System.out.println(rechteck1.farbe);*/

        leinwand.zeichne(rechteck1);
        leinwand.zeichne(kreis1);
    }
}
