package it.unibs.ing.fp.schildt.ch9Interface;
//listing 13
class Es13_TestIface {
  public static void main(String args[]) {
    Es10_Callback c = new Es12_Client();
    c.callback(42);
  }
}
