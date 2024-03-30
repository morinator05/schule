public class Knoten {

    private int wert;

    Knoten links;
    Knoten rechts;

    Knoten(int einfZahl) {
        wert = einfZahl;
    }

    public int getWert() {
        return wert;
    }

}
