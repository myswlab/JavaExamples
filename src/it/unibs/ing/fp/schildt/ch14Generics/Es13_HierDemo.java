package it.unibs.ing.fp.schildt.ch14Generics;
// listing 13
// A subclass can add its own type parameters. 
class Gen13<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen13(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
 
// A subclass of Gen13 that defines a second 
// type parameter, called V. 
class Gen132<T, V> extends Gen13<T> { 
  V ob2; 
 
  Gen132(T o, V o2) { 
    super(o); 
    ob2 = o2; 
  } 
 
  V getob2() { 
    return ob2; 
  } 
} 
  
// Create an object of type Gen132. 
class Es13_HierDemo {  
  public static void main(String args[]) {  
    
    // Create a Gen132 object for String and Integer. 
    Gen132<String, Integer> x = 
      new Gen132<String, Integer>("Value is: ", 99);  
 
    System.out.print(x.getob()); 
    System.out.println(x.getob2()); 
  }  
}
