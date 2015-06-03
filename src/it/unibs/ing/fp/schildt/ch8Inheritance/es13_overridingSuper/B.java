package it.unibs.ing.fp.schildt.ch8Inheritance.es13_overridingSuper;


class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  //  this overrides show() in A but also uses A's show()
  void show() {
   super.show(); // this calls A's show()
    System.out.println("k: " + k);
  }
}
  
