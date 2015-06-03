package it.unibs.ing.fp.schildt.ch9Interface;
//listing 12
class Es12_Client implements Es10_Callback {
  // Implement Callback's interface
  public void callback(int p) {
    System.out.println("callback called with " + p);
  }

  void nonIfaceMeth() {
    System.out.println("Classes that implement interfaces " +
                       "may also define other members, too.");
  }
}

