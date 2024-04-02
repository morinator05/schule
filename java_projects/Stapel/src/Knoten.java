public class Knoten {

    private Knoten naechster; 
    private int inhalt;
    
    Knoten(int inhalt) {
        this.inhalt = inhalt;                                     
    }
    
    public Knoten getNaechster() {
        return naechster;
    }
    public void setNaechster(Knoten naechster) {
        this.naechster = naechster;
    }
    public int getInhalt() {
        return inhalt;
    }
    public void setInhalt(int inhalt) {
        this.inhalt = inhalt;
    }

    


}
