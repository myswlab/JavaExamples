package it.unibs.ing.fp.schildt.ch17JFC;
//listing 17
// Modern, generics version. 
import java.util.*; 
 
class Es17_NewStyle {  
  public static void main(String args[]) { 
 
    // Now, list holds references of type String. 
    ArrayList<String> list = new ArrayList<String>(); 
 
    list.add("one"); 
    list.add("two"); 
    list.add("three"); 
    list.add("four"); 
 
    // Notice that Iterator is also generic. 
    Iterator<String> itr = list.iterator(); 
 
    // The following statement will now cause a compile-time eror. 
//    Iterator<Integer> itr = list.iterator(); // Error! 
 
    while(itr.hasNext()) { 
      String str = itr.next(); // no cast needed 
 
      // Now, the following line is a compile-time, 
      // rather than runtime, error. 
//    Integer i = itr.next(); // this won't compile 
 
      System.out.println(str + " is " + str.length() + " chars long."); 
    } 
  }  
}
