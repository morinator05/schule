public class Baum {

    Knoten wurzel;
    private int anzKnoten;


    //beim erstellen des baums muss ein Wert für die "wurzel" angegeben werden
    Baum(int einfZahl) {

        wurzel = new Knoten(einfZahl);
        anzKnoten = 1;

    }

    public void einfügen(int einfZahl, Knoten zeiger) {

        //methode rekursiv für den passenden Teilbaum aufrufen
        if(einfZahl < zeiger.getWert() && zeiger.links != null) {
            einfügen(einfZahl, zeiger.links);
            return;
        }
        else if(einfZahl > zeiger.getWert() && zeiger.rechts != null) {
            einfügen(einfZahl, zeiger.rechts);
            return;
        }

        //falls der baum nicht tiefer geht einfügen
        if(einfZahl < zeiger.getWert() && zeiger.links == null) {
            zeiger.links = new Knoten(einfZahl);
        }
        else if(einfZahl > zeiger.getWert() && zeiger.rechts == null) {
            zeiger.rechts = new Knoten(einfZahl);
        }
        anzKnoten++;
    }

    public void ausgebenInorder(Knoten zeiger) {

        if(zeiger.links != null) {
            ausgebenInorder(zeiger.links);
        }
        System.out.print(zeiger.getWert() + " ");
        if(zeiger.rechts != null) {
            ausgebenInorder(zeiger.rechts);
        }

    }

    public void ausgebenPreorder(Knoten zeiger) {

        System.out.print(zeiger.getWert() + " ");
        if(zeiger.links != null) {
            ausgebenInorder(zeiger.links);
        }

        if(zeiger.rechts != null) {
            ausgebenInorder(zeiger.rechts);
        }

    }

    public void ausgebenPostorder(Knoten zeiger) {

        if(zeiger.links != null) {
            ausgebenInorder(zeiger.links);
        }
        if(zeiger.rechts != null) {
            ausgebenInorder(zeiger.rechts);
        }
        System.out.print(zeiger.getWert() + " ");

    }

}
