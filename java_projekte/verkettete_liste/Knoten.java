public class Knoten
{
  private String daten;
  private Knoten naechster;
  
  public Knoten (String initDaten)
  {
    daten = initDaten;
  }
  
  public void setNaechster(Knoten k)
  {
    naechster = k;
  }  
  public Knoten getNaechster()
  {
    return naechster; // evtl. Null  
  }
  
  public String getDaten()
  {
    return daten;
  }
  
}
