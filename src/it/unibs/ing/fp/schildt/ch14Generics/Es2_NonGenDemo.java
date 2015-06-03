package it.unibs.ing.fp.schildt.ch14Generics;
//listing 2
// NonGen2 is functionally equivalent to Gen2 
// but does not use generics.  
class NonGen2 {  
  Object ob; // ob is now of type Object 
    
  // Pass the constructor a reference to   
  // an object of type Object 
  NonGen2(Object o) {  
    ob = o;  
  }  
  
  // Return type Object. 
  Object getob() {  
    return ob;  
  }  
 
  // Show type of ob.  
  void showType() {  
    System.out.println("Type of ob is " +  
                       ob.getClass().getName());  
  }  
}  
  
// Demonstrate the non-generic class.  
class Es2_NonGen2Demo {  
  public static void main(String args[]) {  
    NonGen2 iOb;   
  
    // Create NonGen2 Object and store 
    // an Integer in it. Autoboxing still occurs. 
    iOb = new NonGen2(88);  
  
    // Show the type of data used by iOb. 
    iOb.showType(); 
 
    // Get the value of iOb. 
    // This time, a cast is necessary. 
    int v = (Integer) iOb.getob();  
    System.out.println("value: " + v);  
  
    System.out.println();  
  
    // Create another NonGen2 object and  
    // store a String in it. 
    NonGen2 strOb = new NonGen2("Non-Gen2erics Test");  
  
    // Show the type of data used by strOb. 
    strOb.showType(); 
 
    // Get the value of strOb. 
    // Again, notice that a cast is necessary.  
    String str = (String) strOb.getob();  
    System.out.println("value: " + str);  
 
    // This compiles, but is conceptually wrong! 
    iOb = strOb; 
    v = (Integer) iOb.getob(); // run-time error! 
  }  
}
