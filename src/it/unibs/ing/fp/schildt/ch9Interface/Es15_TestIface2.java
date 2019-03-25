package it.unibs.ing.fp.schildt.ch9Interface;
//listing 15
class Es15_TestIface2 {
  public static void main(String args[]) {
    Es10_Callback c = new Es12_Client();
    Es14_AnotherClient ob = new Es14_AnotherClient();

    c.callback(42);

    c = ob; // c now refers to AnotherClient object
    c.callback(42);
  }
}
