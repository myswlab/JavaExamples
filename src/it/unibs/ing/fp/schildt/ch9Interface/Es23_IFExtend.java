package it.unibs.ing.fp.schildt.ch9Interface;
//listing 23
// One interface an extend another.
interface A23 {
  void meth1();
  void meth2();
}

// B now includes meth1() and meth2() -- it adds meth3().
interface B23 extends A23 {
  void meth3();
}

// This class must implement all of A and B
class MyClass implements B23 {
  public void meth1() {
    System.out.println("Implement meth1().");
  }

  public void meth2() {
    System.out.println("Implement meth2().");
  }

  public void meth3() {
    System.out.println("Implement meth3().");
  }
}

class Es23_IFExtend {
  public static void main(String arg[]) {
    MyClass ob = new MyClass();

    ob.meth1();
    ob.meth2();
    ob.meth3();
  }
}


