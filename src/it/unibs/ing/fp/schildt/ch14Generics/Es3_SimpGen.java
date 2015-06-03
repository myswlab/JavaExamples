package it.unibs.ing.fp.schildt.ch14Generics;

//listing 3
// A simple generic class with two type 
// parameters: T and V. 
class TwoGen3<T, V> { 
  T ob1; 
  V ob2; 
   
  // Pass the constructor a reference to  
  // an object of type T. 
  TwoGen3(T o1, V o2) { 
    ob1 = o1; 
    ob2 = o2; 
  } 
 
  // Show types of T and V. 
  void showTypes() { 
    System.out.println("Type of T is " + 
                       ob1.getClass().getName()); 
 
    System.out.println("Type of V is " + 
                       ob2.getClass().getName()); 
  } 
 
  T getob1() { 
    return ob1; 
  } 
 
  V getob2() { 
    return ob2; 
  } 
} 
 
// Demonstrate TwoGen3. 
class Es3_SimpGen3 { 
  public static void main(String args[]) { 
 
    TwoGen3<Integer, String> tgObj = 
      new TwoGen3<Integer, String>(88, "Gen3erics"); 
 
    // Show the types. 
    tgObj.showTypes(); 
 
    // Obtain and show values. 
    int v = tgObj.getob1(); 
    System.out.println("value: " + v); 
 
    String str = tgObj.getob2(); 
    System.out.println("value: " + str); 
  } 
}
