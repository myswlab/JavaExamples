/**
 * Questa classe definisce il prototipo
 * di oggetti che presentano saluti 
 * 
 * @author Gruppo Docenti Infob
 *
 */
public class Assistant
{
  /** Il saluto che verra’ 
*  presentato a video
  */
 private String mioSaluto;

 /**
  * Il solo costruttore definito per la classe:
  * inizializza il saluto specifico dell'istanza
  *
  * @param cosaDevoDire il saluto da utilizzare
  */ 

 public Assistant (String cosaDevoDire)
 {
   mioSaluto = cosaDevoDire;  
 }
/**
  * Questo metodo stampa a video un saluto
  * stabilito per ciascuna istanza
  * al momento della costruzione
  * @return Il metodo non restituisce nulla
*/

 public void saluta ()
 {
  System.out.println(mioSaluto); 
 } 

}