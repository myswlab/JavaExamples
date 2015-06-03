package it.unibs.ing.fp.schildt.ch14Generics;
// listing 15
// Use the instanceof operator with a generic class hierarchy.  
class Gen15<T> {   
  T ob;  
     
  Gen15(T o) {   
    ob = o;   
  }   
   
  // Return ob.   
  T getob() {   
    return ob;   
  }   
}   
  
// A subclass of Gen15.  
class Gen152<T> extends Gen15<T> {  
  Gen152(T o) {  
    super(o);  
  }  
}  
  
// Demonstrate run-time type ID implications of generic 
// class hierarchy. 
class Es15_HierDemo3 {   
  public static void main(String args[]) {   
     
    // Create a Gen15 object for Integers.  
    Gen15<Integer> iOb = new Gen15<Integer>(88);  
  
    // Create a Gen152 object for Integers.  
    Gen152<Integer> iOb2 = new Gen152<Integer>(99);   
    
    // Create a Gen152 object for Strings.  
    Gen152<String> strOb2 = new Gen152<String>("Gen15erics Test");   
  
    // See if iOb2 is some form of Gen152. 
    if(iOb2 instanceof Gen152<?>)   
      System.out.println("iOb2 is instance of Gen152");  
 
    // See if iOb2 is some form of Gen15. 
    if(iOb2 instanceof Gen15<?>)   
      System.out.println("iOb2 is instance of Gen15");  
  
    System.out.println();  
  
    // See if strOb2 is a Gen152. 
    if(strOb2 instanceof Gen152<?>)   
      System.out.println("strOb is instance of Gen152");  
  
    // See if strOb2 is a Gen15. 
    if(strOb2 instanceof Gen15<?>)   
      System.out.println("strOb is instance of Gen15");  
 
    System.out.println();  
  
    // See if iOb is an instance of Gen152, which it is not. 
    if(iOb instanceof Gen152<?>)   
      System.out.println("iOb is instance of Gen152");  
  
    // See if iOb is an instance of Gen15, which it is. 
    if(iOb instanceof Gen15<?>)   
      System.out.println("iOb is instance of Gen15");  
  
    // The following can't be compiled because  
    // generic type info does not exist at run-time. 
//    if(iOb2 instanceof Gen152<Integer>)   
//      System.out.println("iOb2 is instance of Gen152<Integer>");  
  }   
}
