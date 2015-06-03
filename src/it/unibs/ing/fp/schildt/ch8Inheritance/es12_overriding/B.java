package it.unibs.ing.fp.schildt.ch8Inheritance.es12_overriding;

class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  // display k -- this overrides show() in A
  void show() {
    System.out.println("k: " + k);
  }
}
  
