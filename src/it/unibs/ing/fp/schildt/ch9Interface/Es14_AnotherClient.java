package it.unibs.ing.fp.schildt.ch9Interface;
//listing 14
// Another implementation of Callback.
class Es14_AnotherClient implements Es10_Callback {
  // Implement Callback's interface
  public void callback(int p) {
    System.out.println("Another version of callback");
    System.out.println("p squared is " + (p*p));
  }
}
