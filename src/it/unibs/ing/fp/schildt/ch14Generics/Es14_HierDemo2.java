package it.unibs.ing.fp.schildt.ch14Generics;
// listing 14
// A nongeneric class can be the superclass 
// of a generic subclass. 
 
// A nongeneric class. 
class NonGen14 { 
  int num; 
 
  NonGen14(int i) { 
    num = i; 
  } 
 
  int getnum() { 
    return num; 
  } 
} 
 
// A generic subclass. 
class Gen14<T> extends NonGen14 {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen14(T o, int i) {  
    super(i); 
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
  
// Create a Gen14 object. 
class Es14_HierDemo2 {  
  public static void main(String args[]) {  
    
    // Create a Gen14 object for String. 
    Gen14<String> w = new Gen14<String>("Hello", 47); 
    
    System.out.print(w.getob() + " "); 
    System.out.println(w.getnum()); 
  }  
}
