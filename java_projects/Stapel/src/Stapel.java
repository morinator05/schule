public class Stapel {

    private int anzElemente = 0;
    private Knoten anfang;

    Stapel() {

    }

    public boolean istLeer() {
        return (anzElemente == 0); 
    }

    public void push(int pInhalt) {
        
        if(anfang != null) {
            Knoten zeiger = anfang;

            while (zeiger.getNaechster() != null) {
                zeiger = zeiger.getNaechster();
            }
            zeiger.setNaechster(new Knoten(pInhalt));

        }
        else {
            anfang = new Knoten(pInhalt);
        } 

        anzElemente ++;
    }

    public int pop() {
        if(anfang != null) {
            Knoten zeiger = anfang;
            Knoten vorheriger = anfang;

            while (zeiger.getNaechster() != null) {
                vorheriger = zeiger;
                zeiger = zeiger.getNaechster();
            }
            vorheriger.setNaechster(null);
            anzElemente --;
            return zeiger.getInhalt();
            

        }
        else {
            System.out.println("leer:(");
            return -1;
        } 
    }

    public int top() {
        if(anfang != null) {
            Knoten zeiger = anfang;

            while (zeiger.getNaechster() != null) {
                zeiger = zeiger.getNaechster();
            }
            return zeiger.getInhalt();
            

        }
        else {
            System.out.println("leer:(");
            return -1;
        } 
    }

    public int anzahlElemente() {
        return anzElemente;
    }
}
