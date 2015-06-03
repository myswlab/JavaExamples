package it.unibs.ing.fp.schildt.ch14Generics;
//listing 11
// Demonstrate a raw type. 
class Gen11<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen11(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
  
// Demonstrate raw type. 
class Es11_RawDemo {  
  public static void main(String args[]) {  
 
    // Create a Gen11 object for Integers. 
    Gen11<Integer> iOb = new Gen11<Integer>(88);  
   
    // Create a Gen11 object for Strings. 
    Gen11<String> strOb = new Gen11<String>("Gen11erics Test");  
  
    // Create a raw-type Gen11 object and give it 
    // a Double value. 
    Gen11 raw = new Gen11(new Double(98.6)); 
 
    // Cast here is necessary because type is unknown. 
    double d = (Double) raw.getob(); 
    System.out.println("value: " + d); 
 
    // The use of a raw type can lead to run-time. 
    // exceptions.  Here are some examples. 
 
    // The following cast causes a run-time error! 
//    int i = (Integer) raw.getob(); // run-time error 
 
    // This assigment overrides type safety. 
    strOb = raw; // OK, but potentially wrong 
//    String str = strOb.getob(); // run-time error  
     
    // This assingment also overrides type safety. 
    raw = iOb; // OK, but potentially wrong 
//    d = (Double) raw.getob(); // run-time error 
  }  
}
