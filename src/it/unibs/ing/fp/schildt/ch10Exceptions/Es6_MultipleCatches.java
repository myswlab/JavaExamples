package it.unibs.ing.fp.schildt.ch10Exceptions;

//listing 6
// Demonstrate multiple catch statements.
class Es6_MultipleCatches {
  public static void main(String args[]) {
    try {
      int a = args.length;
 //     a=10;
      System.out.println("a = " + a);
      int b = 42 / a;
      int c[] = { 1 };
      c[42] = 99;
    } catch(ArithmeticException e) {
      System.out.println("Divide by 0: " + e);
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index oob: " + e);
    }
    System.out.println("After try/catch blocks.");
  }
}
