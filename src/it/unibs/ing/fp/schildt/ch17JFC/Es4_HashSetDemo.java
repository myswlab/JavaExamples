package it.unibs.ing.fp.schildt.ch17JFC;
//listing 4
// Demonstrate HashSet. 
import java.util.*; 
 
class Es4_HashSetDemo { 
  public static void main(String args[]) { 
    // Create a hash set. 
    HashSet<String> hs = new HashSet<String>(); 
     
    // Add elements to the hash set. 
    hs.add("B"); 
    hs.add("A"); 
    hs.add("D"); 
    hs.add("E"); 
    hs.add("C"); 
    hs.add("F"); 
 
    System.out.println(hs); 
  } 
}
