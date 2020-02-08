package it.unibs.ing.fp.schildt.ch17JFC;
//listing 5
// Demonstrate TreeSet. 
import java.util.*; 
 
class Es5_TreeSetDemo { 
  public static void main(String args[]) { 
    // Create a tree set. 
    TreeSet<String> ts = new TreeSet<String>(); 
     
    // Add elements to the tree set. 
    ts.add("C"); 
    ts.add("A"); 
    ts.add("B"); 
    ts.add("E"); 
    ts.add("F"); 
    ts.add("D"); 

    ts.add("D"); 
 
    System.out.println(ts); 
  } 
}

