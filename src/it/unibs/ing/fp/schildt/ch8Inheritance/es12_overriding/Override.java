package it.unibs.ing.fp.schildt.ch8Inheritance.es12_overriding;


class Override {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);

    subOb.show(); // this calls show() in B
  }
}
