package it.unibs.ing.fp.schildt.ch8Inheritance.es13_overridingSuper;


class Override {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);

    subOb.show(); // this calls show() in B
  }
}
