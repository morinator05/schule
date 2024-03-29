public class App {
    public static void main(String[] args) throws Exception {
        
        Baum b1 = new Baum(4);

        for(int i = 0; i < 9; i++) {
            b1.einfügen ((int)(Math.random() * 10) + 1, b1.wurzel);
        }

        b1.ausgebenInorder(b1.wurzel);

        

    }

}
