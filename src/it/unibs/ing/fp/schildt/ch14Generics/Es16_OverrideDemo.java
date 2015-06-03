package it.unibs.ing.fp.schildt.ch14Generics;
// listing 16
// Overriding a generic method in a generic class. 
class Gen16<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen16(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    System.out.print("Gen16's getob(): " ); 
    return ob;  
  }  
}  
 
// A subclass of Gen16 that overrides getob(). 
class Gen162<T> extends Gen16<T> { 
 
  Gen162(T o) { 
    super(o); 
  } 
   
  // Override getob(). 
  T getob() {  
    System.out.print("Gen162's getob(): "); 
    return ob;  
  }  
} 
  
// Demonstrate generic method override. 
class Es16_OverrideDemo {  
  public static void main(String args[]) {  
    
    // Create a Gen16 object for Integers. 
    Gen16<Integer> iOb = new Gen16<Integer>(88); 
 
    // Create a Gen162 object for Integers. 
    Gen162<Integer> iOb2 = new Gen162<Integer>(99);  
   
    // Create a Gen162 object for Strings. 
    Gen162<String> strOb2 = new Gen162<String>("Gen16erics Test");  
 
    System.out.println(iOb.getob()); 
    System.out.println(iOb2.getob()); 
    System.out.println(strOb2.getob()); 
  }  
}
