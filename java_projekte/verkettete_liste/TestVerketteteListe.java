public class TestVerketteteListe {
  
  public static void main(String[] args) {
    VerketteteListe vListe = new VerketteteListe();
    
    vListe.einfuegenVorne("Flo");
    vListe.einfuegenVorne("Ada");
    vListe.ausgeben();
    System.out.println();

    vListe.einfuegenHinten("kek");
    vListe.ausgeben();
    System.out.println();
 
    vListe.einfugenAnPos(3, "Moritz");
    vListe.ausgeben();
    System.out.println();
  }

}

