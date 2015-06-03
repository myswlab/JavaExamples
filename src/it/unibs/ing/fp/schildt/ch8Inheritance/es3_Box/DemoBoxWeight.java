package it.unibs.ing.fp.schildt.ch8Inheritance.es3_Box;


class DemoBoxWeight {
  public static void main(String args[]) {
    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
    double vol;
    Box myBox=mybox1;
    

    vol = myBox.volume();
 //   double d=myBox.getWeight();
    
    
    System.out.println("Volume of mybox1 is " + vol);
    System.out.println("Weight of mybox1 is " + mybox1.getWeight());
    System.out.println();

    vol = mybox2.volume();
    System.out.println("Volume of mybox2 is " + vol);
    System.out.println("Weight of mybox2 is " + mybox2.getWeight());
  }
}

