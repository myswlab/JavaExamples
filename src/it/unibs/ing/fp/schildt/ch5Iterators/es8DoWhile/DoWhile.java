package it.unibs.ing.fp.schildt.ch5Iterators.es8DoWhile;

// Demonstrate the do-while loop.
class DoWhile {
  public static void main(String args[]) {
    int n = 10;

    do {
      System.out.println("tick " + n);
      n--;
    } while(n > 0);
  }
}

