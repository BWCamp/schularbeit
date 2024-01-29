package Einstieg_OOP;

import ack.shapes.Leinwand;

public class EinfachAnimation {

    public static void main(String[] args){
        Kreis kreis1 = new Kreis(250, 150, 100, "gruen");
        Leinwand leinwand = new Leinwand();
        leinwand.zeichne(kreis1);

        for(int i = 0; i < 50; i++) {
            kreis1.verschieben(5, 5);
            leinwand.warte(25);
            leinwand.zeichne(kreis1);
        }
    }
}
