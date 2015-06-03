package it.unibs.ing.fp.schildt.ch14Generics;
// listing 20
// Ambiguity caused by erasure on  
// overloaded methods. 
class MyGen20Class<T, V> {  
  T ob1;  
  V ob2;  
 
  // ... 
 
  // These two overloaded methods are ambiguous 
  // and will not compile. 
  void set(T o) { 
    ob1 = o; 
  } 
 
  void set(V o) { 
    ob2 = o; 
  } 
}