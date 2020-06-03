package it.unibs.ing.fp.schildt.ch17JFC;
//listing 9
// A simple mailing list example.  
import java.util.*;  
  
class Es9_Address {  
  private String name;  
  private String street;  
  private String city;  
  private String state;  
  private String code;  
  
  Es9_Address(String n, String s, String c,   String st, String cd) {  
    name = n;  
    street = s;  
    city = c;  
    state = st;  
    code = cd;  
  }  
  
  public String toString() {  
    return name + "\n" + street + "\n" +  
           city + " " + state + " " + code;  
  }  
}  
  
class Es9_Address_MailList {  
  public static void main(String args[]) {  
    LinkedList<Es9_Address> ml = new LinkedList<Es9_Address>();  
      
    // Add elements to the linked list. 
    ml.add(new Es9_Address("J.W. West", "11 Oak Ave",  
                       "Urbana", "IL", "61801"));  
    ml.add(new Es9_Address("Ralph Baker", "1142 Maple Lane",  
                       "Mahome", "IL", "61853"));  
    ml.add(new Es9_Address("Tom Carlton", "867 Elm St",  
                       "Champaign", "IL", "61820"));  
 
    // Display the mailing list. 
    for(Es9_Address element : ml) 
      System.out.println(element + "\n");  
 
    System.out.println();  
  }  
}
