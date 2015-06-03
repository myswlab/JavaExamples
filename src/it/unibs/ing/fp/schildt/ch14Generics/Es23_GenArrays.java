package it.unibs.ing.fp.schildt.ch14Generics;
// listing 23
// Gen23erics and arrays. 
class Gen23<T extends Number> {  
  T ob;  
 
  T vals[]; // OK 
 
  Gen23(T o, T[] nums) {  
    ob = o; 
 
    // This statement is illegal. 
    // vals = new T[10]; // can't create an array of T 
 
    // But, this statement is OK. 
    vals = nums; // OK to assign reference to existent array 
  }  
}  
  
class Es23_Gen23Arrays {  
  public static void main(String args[]) {  
    Integer n[] = { 1, 2, 3, 4, 5 };   
 
    Gen23<Integer> iOb = new Gen23<Integer>(50, n); 
 
    // Can't create an array of type-specific generic references. 
    // Gen23<Integer> gens[] = new Gen23<Integer>[10]; // Wrong! 
 
    // This is OK. 
    Gen23<?> gens[] = new Gen23<?>[10]; // OK
  } 
}

