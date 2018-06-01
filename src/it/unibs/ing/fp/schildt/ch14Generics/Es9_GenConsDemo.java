package it.unibs.ing.fp.schildt.ch14Generics;

//listing 9
// Use a generic constructor. 
class Gen9Cons { 
  private double val; 
 
  <T extends Number> Gen9Cons(T arg) { 
    val = arg.doubleValue(); 
  } 
 
  void showval() { 
    System.out.println("val: " + val); 
  } 
} 
 
class Es9_GenConsDemo { 
  public static void main(String args[]) { 
 
    Gen9Cons test = new Gen9Cons(100); 
    Gen9Cons test2 = new Gen9Cons(123.5F); 
 
    test.showval(); 
    test2.showval(); 
  } 
}
