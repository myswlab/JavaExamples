package it.unibs.ing.fp.schildt.ch14Generics;
// listing 18
class Es18_Gen18TypeDemo {  
  public static void main(String args[]) {  
    Es17_Gen<Integer> iOb = new Es17_Gen<Integer>(99);  
    Es17_Gen<Float> fOb = new Es17_Gen<Float>(102.2F); 
 
    System.out.println(iOb.getClass().getName()); 
    System.out.println(fOb.getClass().getName()); 
  } 
}