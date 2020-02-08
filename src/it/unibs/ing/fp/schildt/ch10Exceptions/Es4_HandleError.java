package it.unibs.ing.fp.schildt.ch10Exceptions;

//listing 4
// Handle an exception and move on.
import java.util.Random;

class Es4_HandleError {
  public static void main(String args[]) {
    int a=0, b=0, c=0, d=0;
    Random r = new Random();

    for(int i=0; i<32000; i++) {
      try {
        b = r.nextInt();
        c = r.nextInt();
        d= b/c;
        a = 12345 / d;
      } catch (ArithmeticException e) {
        System.out.println("\nDivision by zero.");
        a = 0; // set a to zero and continue
      }
      System.out.println("a: " + a);
    }
  }
}

