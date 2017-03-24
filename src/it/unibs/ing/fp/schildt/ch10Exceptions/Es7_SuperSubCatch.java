package it.unibs.ing.fp.schildt.ch10Exceptions;

//listing 7
/*  This program contains an error.
 
   A subclass must come before its superclass in 
   a series of catch statements. If not, 
   unreachable code will be created and a
   compile-time error will result.
*/
class Es7_SuperSubCatch {
  public static void main  (String args[]) {
    try {
      int a = 0;
      int b = 42 / a;
    } catch(Exception e) { //IllegalStateException e
        System.out.println("Generic Exception catch.");
      }
    /* This catch is never reached because
       ArithmeticException is a subclass of Exception. */
   catch(ArithmeticException e) { // ERROR - unreachable
     System.out.println("This is never reached.");
   }
  }
}


