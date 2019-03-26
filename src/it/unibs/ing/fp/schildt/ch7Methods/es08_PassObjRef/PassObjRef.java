package it.unibs.ing.fp.schildt.ch7Methods.es08_PassObjRef;


class PassObjRef {
  public static void main(String args[]) {
    Test ob = new Test(15, 20);
    
    System.out.println("ob.a and ob.b before call: " +
                       ob.getA() + " " + ob.getB());

    ob.meth(ob); 

    System.out.println("ob.a and ob.b after call: " +
                       ob.getA() + " " + ob.getB());
  }
}

