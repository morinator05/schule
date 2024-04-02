public class Hausaufgabe {

    private String fach;
    private String aufgaben;
    private Datum aubgabeDatum;
    private int geschaetzeDauer;
    
    Hausaufgabe() {
        
    }

    public String getFach() {
        return fach;
    }
    public void setFach(String fach) {
        this.fach = fach;
    }
    public String getAufgaben() {
        return aufgaben;
    }
    public void setAufgaben(String aufgaben) {
        this.aufgaben = aufgaben;
    }
    public Datum getAubgabeDatum() {
        return aubgabeDatum;
    }
    public void setAubgabeDatum(Datum aubgabeDatum) {
        this.aubgabeDatum = aubgabeDatum;
    }
    public int getGeschaetzeDauer() {
        return geschaetzeDauer;
    }
    public void setGeschaetzeDauer(int geschaetzeDauer) {
        this.geschaetzeDauer = geschaetzeDauer;
    }

}
