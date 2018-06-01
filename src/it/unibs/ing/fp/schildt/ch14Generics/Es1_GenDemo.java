package it.unibs.ing.fp.schildt.ch14Generics;
//listing 1
// A simple generic class.  
// Here, T is a type parameter that 
// will be replaced by a real type 
// when an object of type Gen1 is created. 
class Gen1<T> {
	
  T ob; // declare an object of type T 
   
  // Pass the constructor a reference to  
  // an object of type T. 
  Gen1(T o) { 
    ob = o; 
  } 
 
  // Return ob. 
  T getob() { 
    return ob; 
  } 
 
  // Show type of T. 
  void showType() { 
    System.out.println("Type of T is " + 
                       ob.getClass().getName()); 
  } 
} 
 
// Demonstrate the generic class. 
public class Es1_GenDemo { 
	

  public static void main(String args[]) { 
    // Create a Gen1 reference for Integers.  
    Gen1<Integer> iOb;  
    // Create a Gen1<Integer> object and assign its 
    // reference to iOb.  Notice the use of autoboxing  
    // to encapsulate the value 88 within an Integer object. 
    iOb = new Gen1<Integer>(88); 
    
 
    // Show the type of data used by iOb. 
    iOb.showType(); 
 
    // Get the value in iOb. Notice that 
    // no cast is needed. 
    int v = iOb.getob(); 
    System.out.println("value: " + v); 
 
    System.out.println(); 
 
    // Create a Gen1 object for Strings. 
    Gen1<String> strOb = new Gen1<String>("Gen1erics Test"); 
 
    // Show the type of data used by strOb. 
    strOb.showType(); 
 
    // Get the value of strOb. Again, notice 
    // that no cast is needed. 
    String str = strOb.getob(); 
    System.out.println("value: " + str); 
  } 
}
