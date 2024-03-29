public class App {
    public static void main(String[] args) throws Exception {

        Verketteteliste v1 = new Verketteteliste();

        v1.einfügen("Moritz");
        v1.einfügen("Nick");
        v1.einfügen("Rick");
        v1.printAnzKnoten();

        //hier testen
        v1.löscheErstesElement();

        v1.printListe();


    }
}
