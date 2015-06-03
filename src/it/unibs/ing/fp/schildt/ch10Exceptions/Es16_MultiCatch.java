package it.unibs.ing.fp.schildt.ch10Exceptions;

//listing 16
// Demonstrate JDK 7's multi-catch feature.
class Es16_MultiCatch {
  public static void main(String args[]) {
    int a=10, b=0;
    int vals[] = { 1, 2, 3 };
    
    try {
//      int result = a / b; // generate an ArithmeticException  
   
      vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

      // This catch clause catches both exceptions.
    } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    }

    System.out.println("After multi-catch.");
  }
}

