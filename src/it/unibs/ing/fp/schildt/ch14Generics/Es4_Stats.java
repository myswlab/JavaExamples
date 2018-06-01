package it.unibs.ing.fp.schildt.ch14Generics;

//listing 4
// Stats attempts (unsuccessfully) to  
// create a generic class that can compute 
// the average of an array of numbers of 
// any given type. 
// 
// The class contains an error! 
class Es4_Stats<T> {  
  T[] nums; // nums is an array of type T 

  
  // Pass the constructor a reference to   
  // an array of type T. 
  Es4_Stats(T[] o) {  
    nums = o;  
  }  
  
  // Return type double in all cases. 
  double average() {  
    double sum = 0.0; 
 
//    for(int i=0; i < nums.length; i++)  
//      sum += nums[i].doubleValue(); // Error!!! 
 
    return sum / nums.length; 
  }  
}
