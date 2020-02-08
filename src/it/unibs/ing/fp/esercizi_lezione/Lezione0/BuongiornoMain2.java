public class BuongiornoMain2
{
 private final static String SALUTO_ITA = "Buongiorno!";
 private final static String SALUTO_FRA = "Bonjour!";

 public static void main (String args[])
  {
   Assistant2 assistenteIta, assistenteFra;

   //assistenteIta = new Assistant2(SALUTO_ITA);
   assistenteIta = new Assistant2();
   assistenteFra = new Assistant2(SALUTO_FRA);
   assistenteIta.saluta();
   assistenteFra.saluta(); 
  }
}
