public class App {
    public static void main(String[] args) throws Exception {
        
        Baum b1 = new Baum(4);

        for(int i = 0; i < 20; i++) {
            b1.einfügen ((int)(Math.random() * 30), b1.wurzel);
        }

        b1.einfügen(34, b1.wurzel);  b1.einfügen(33, b1.wurzel);

        b1.ausgebenInorder(b1.wurzel); System.out.println();
        b1.ausgebenPreorder(b1.wurzel); System.out.println();
        b1.ausgebenPostorder(b1.wurzel); System.out.println();

    }

}
