public class Stapel {

    private int anzElemente = 0;
    private Knoten anfang;

    Stapel() {

    }

    public boolean istLeer() {
        return (anzElemente == 0); 
    }

    //füge Element hinzu
    public void push(int pInhalt) {
        
        if(anfang != null) {
            Knoten tempKnoten = anfang;
            anfang = new Knoten(pInhalt);
            anfang.setNaechster(tempKnoten);
        }
        else {
            anfang = new Knoten(pInhalt);
        } 

        anzElemente ++;
    }

    //entferne oberstes element
    public int pop() {
        if(anfang != null) {
            
            Knoten temKnoten = anfang; 
            anfang = temKnoten.getNaechster();
            anzElemente --;

            return temKnoten.getInhalt();

        }
        else {
            System.out.println("leer:(");
            return -1;
        } 
    }

    public int top() {
        if(anfang != null) {
            
            return anfang.getInhalt();

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
