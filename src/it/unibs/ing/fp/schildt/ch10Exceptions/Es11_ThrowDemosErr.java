package it.unibs.ing.fp.schildt.ch10Exceptions;



//listing 11
// This program contains an error and will not compile.
class es11_ThrowsDemoErr {
  static void throwOne() {
    System.out.println("Inside throwOne.");
    throw new IllegalAccessException("demo");
  }
  public static void main(String args[]) {
    throwOne();
  }
}


