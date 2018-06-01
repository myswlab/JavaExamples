package it.unibs.ing.fp.schildt.ch10Exceptions;

//listing 3
class Es3_Exc2 {
  public static void main(String args[]) {
    int d, a;

   try { // monitor a block of code.
      d = 0;
      a = 42 / d;
      System.out.println("This will not be printed.");
    } catch (ArithmeticException e) { // catch divide-by-zero error
      System.out.println("Division by zero.");
      a=0;
    }
    System.out.println("After catch statement.");
  }
}

