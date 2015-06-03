package it.unibs.ing.fp.schildt.ch14Generics;
// listing 17
// Here, T is bound by Object by default. 
class Es17_Gen<T> {  
  T ob; // here, T will be replaced by Object 
    
  Es17_Gen(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
 