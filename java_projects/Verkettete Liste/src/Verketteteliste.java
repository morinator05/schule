public class Verketteteliste {

    Knoten erster;
    private int anzKnoten;

    Verketteteliste() {

    }

    public void printAnzKnoten() {
        System.out.println("AnzKnoten: " + anzKnoten);
    }

    public void printListe() {
        Knoten zeiger;

        System.out.println("------");
        if(erster == null) {
            System.out.println("Die Liste ist leer!");
        }
        else {
            zeiger = erster; System.out.println(zeiger.getName());
            
            while (zeiger.naechster != null) {
                zeiger = zeiger.naechster;
                System.out.println(zeiger.getName());
            }
        }
    }

    public void einfügen(String einfName) {
        Knoten zeiger;

        if(erster == null) {
            erster = new Knoten(einfName);
        }
        else {
            zeiger = erster;
            
            while (zeiger.naechster != null) {
                zeiger = zeiger.naechster;
            }
            
            zeiger.naechster = new Knoten(einfName);
        }

        anzKnoten++;
    }

    public void einfügenVorne(String einfName) {
        Knoten temp = erster;
        erster = new Knoten(einfName);
        erster.naechster = temp;

        anzKnoten++;
    }

    public void einfügenAnStelle(int stelle, String einfName) {
        Knoten zeiger; Knoten temp;

        if(stelle == 0) {
            einfügenVorne(einfName);
        }
        else {
            zeiger = erster;
            stelle --; //da beim ersten begonnen wird
            for (int i = 0; i < stelle; i++) {
            zeiger = zeiger.naechster;
            }

            temp = zeiger.naechster;
            zeiger.naechster = new Knoten(einfName);
            zeiger.naechster.naechster = temp;
        }

        anzKnoten++;
    }

    public void löscheErstesElement() {
        erster = erster.naechster;

        anzKnoten--;
    }

    public void löscheLetztesElement() {
        Knoten zeiger;
        Knoten zuLöschen;

        if(erster == null) {
            System.out.println("Die Liste ist leer!");
        }
        else {
            zeiger = erster;
            zuLöschen = zeiger;
            while (zeiger.naechster != null) {
                zuLöschen = zeiger;
                zeiger = zeiger.naechster;
            }
            zuLöschen.naechster = null;
            
        }

        anzKnoten--;
    }

    public void löscheElementAnStelle(int stelle) {
        Knoten zeiger; Knoten temp;

        if(stelle == 0) {
            erster = erster.naechster;
        }
        else {
            zeiger = erster;
            stelle --; //da beim ersten begonnen wird
            for (int i = 0; i < stelle; i++) {
            zeiger = zeiger.naechster;
            }

            zeiger.naechster = zeiger.naechster.naechster;
            
        }

        anzKnoten--;
    }

}
