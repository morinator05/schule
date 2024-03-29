public class Baum {

    Knoten wurzel;
    private int anzKnoten;

    Baum(int einfZahl) {

        wurzel = new Knoten(einfZahl);

    }

    public void einfügen(int einfZahl, Knoten zeiger) {

        if(einfZahl < zeiger.getWert() && zeiger.links != null) {
            einfügen(einfZahl, zeiger.links);
            return;
        }
        else if(einfZahl > zeiger.getWert() && zeiger.rechts != null) {
            einfügen(einfZahl, zeiger.rechts);
            return;
        }

        if(einfZahl < zeiger.getWert() && zeiger.links == null) {
            zeiger.links = new Knoten(einfZahl);
        }
        else if(einfZahl > zeiger.getWert() && zeiger.rechts == null) {
            zeiger.rechts = new Knoten(einfZahl);
        }
    }

    public void ausgebenInorder(Knoten zeiger) {

        if(zeiger.links != null) {
            ausgebenInorder(zeiger.links);
        }
        System.out.println(zeiger.getWert());
        if(zeiger.rechts != null) {
            ausgebenInorder(zeiger.rechts);
        }

    }

    public void ausgebenPreorder() {

    }

    public void ausgebenPostorder() {

    }



}
