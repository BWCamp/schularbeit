package Einstieg_OOP;
import ack.shapes.Leinwand;

public class ErsteZeichnung {
    public static void main(String[] args) {
        Rechteck rechteck1 = new Rechteck(225, 250, 50, 300, "braun");
        Kreis kreis1 = new Kreis(250, 150, 100, "gruen");
        Kreis kreis2 = new Kreis(550, 75, 50, "gelb");
        Leinwand leinwand = new Leinwand("Sunny Day!", 650, 600);

        Kreis kreis3 = new Kreis(295, 150, 8, "gelb");
        Kreis kreis4 = new Kreis(220, 130, 8, "gelb");
        Kreis kreis5 = new Kreis(250, 190, 8, "gelb");

/*      kreis2.radius = 50;
        kreis2.positionX = 550;
        kreis2.positionY = 75;
        kreis2.farbe = "gelb";*/

        leinwand.zeichne(rechteck1);
        leinwand.zeichne(kreis2);
        leinwand.zeichne(kreis1);
        leinwand.zeichne(kreis3);
        leinwand.zeichne(kreis4);
        leinwand.zeichne(kreis5);

    }
}
