package it.unibs.ing.fp.schildt.ch8Inheritance.es19_final;


class B extends A {
  void meth() { // ERROR! Can't override.
    System.out.println("Illegal!");
  }
}

