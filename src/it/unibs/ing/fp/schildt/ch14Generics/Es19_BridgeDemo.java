package it.unibs.ing.fp.schildt.ch14Generics;
// listing 19
// A situation that creates a bridge method. 
class Gen19<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen19(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
 
// A subclass of Gen19. 
class Gen192 extends Gen19<String> { 
 
  Gen192(String o) { 
    super(o); 
  } 
 
  // A String-specific override of getob(). 
  String getob() { 
    System.out.print("You called String getob(): "); 
    return ob; 
  } 
} 
  
// Demonstrate a situation that requires a bridge method. 
class Es19_BridgeDemo {  
  public static void main(String args[]) {  
 
    // Create a Gen192 object for Strings. 
    Gen192 strOb2 = new Gen192("Gen19erics Test");  
 
    System.out.println(strOb2.getob()); 
  }  
}
