public class VerketteteListe {

    Knoten kopf;

    public VerketteteListe() {

    }

    public boolean isEmpty() {
        return kopf == null;
    }

    public void einfuegenVorne(String name) {
        Knoten knoten = new  Knoten(name);
        knoten.setNaechster(kopf);
        kopf = knoten;
    }
    public void einfuegenVorne(Knoten knoten) {
        knoten.setNaechster(kopf);
        kopf = knoten;
    }

    public void einfuegenHinten(String name) {
        Knoten knoten = kopf;
        Knoten einfKnoten = new  Knoten(name);

        while(knoten.getNaechster() != null) {
            knoten = knoten.getNaechster();
        }
        knoten.setNaechster(einfKnoten);
    }
    public void einfuegenHinten(Knoten einfKnoten) {
        Knoten knoten = kopf;

        while(knoten.getNaechster() != null) {
            knoten = knoten.getNaechster();
        }
        knoten.setNaechster(einfKnoten);
    }

    public void einfugenAnPos(int pos, String name) {
        Knoten knoten = kopf;
        Knoten einfKnoten = new Knoten(name);

        if(pos != 0) {
            for(int i = 1; i < pos; i++) {
            knoten = knoten.getNaechster();
        }
        einfKnoten.setNaechster(knoten.getNaechster());
        knoten.setNaechster(einfKnoten);
        }
        else {
            einfuegenVorne(einfKnoten);
        }

        
        

    }

    public void ausgeben() {

        Knoten knoten = kopf;

        while(knoten != null) {
            System.out.println(knoten.getDaten());
            knoten = knoten.getNaechster();
        }


    }
    
}