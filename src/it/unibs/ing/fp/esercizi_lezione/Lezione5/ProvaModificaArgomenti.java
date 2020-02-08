public class ProvaModificaArgomenti 
 { 
   public static void main (String [] args)
	 { 
     StringBuffer pippo = new StringBuffer("Evviva");
     System.out.println("Prima del metodo:" + pippo);
     metodoProva(pippo);
     System.out.println("Dopo il metodo:" + pippo);
	 }

  static void metodoProva(StringBuffer daCambiare)
   {
    daCambiare.append(" l’Ingegneria !");
    daCambiare=new StringBuffer("Abbasso l’Ingegneria !");
    System.out.println("Dentro il metodo:" + daCambiare);
   }
 }
