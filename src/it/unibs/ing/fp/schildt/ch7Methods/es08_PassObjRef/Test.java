package it.unibs.ing.fp.schildt.ch7Methods.es08_PassObjRef;

// Objects are passed through their references.

class Test {
  private int a, b;

  Test(int i, int j) {
    a = i;
    b = j;
  }

  // pass an object
public  void meth(Test o) {
    o.a *=  2;
    o.b /= 2;
  }


public int getA() {
	return a;
}

public int getB() {
	return b;
}

}

