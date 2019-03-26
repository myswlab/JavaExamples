package it.unibs.ing.fp.schildt.ch7Methods.es09_RetOb;

// Returning an object.
class Test {
  int a;

  Test(int i) {
    a = i;
  }

  Test incrByTen() {
    Test temp = new Test(a+10);
    return temp;
  }
}
