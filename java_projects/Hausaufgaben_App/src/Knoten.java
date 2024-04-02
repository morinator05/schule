public class Knoten {

    private Knoten naechster;
    private Hausaufgabe inhalt;
    
    Knoten() {

    }

    public Knoten getNaechster() {
        return naechster;
    }
    public void setNaechster(Knoten naechster) {
        this.naechster = naechster;
    }
    public Hausaufgabe getInhalt() {
        return inhalt;
    }
    public void setInhalt(Hausaufgabe inhalt) {
        this.inhalt = inhalt;
    }

}
