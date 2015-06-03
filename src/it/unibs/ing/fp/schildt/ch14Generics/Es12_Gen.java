package it.unibs.ing.fp.schildt.ch14Generics;
// listing 12
// A simple generic class hierarchy. 
class Gen12<T> {  
  T ob; 
    
  Gen12(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
 
// A subclass of Gen12. 
class Gen122<T> extends Gen12<T> { 
  Gen122(T o) { 
    super(o); 
  } 
}
