package it.unibs.ing.fp.schildt.ch8Inheritance.es3_Box;


// Here, Box is extened to include weight.
public class BoxWeight extends Box {
  private double weight; // weight of box

  // constructor for BoxWeight
  public BoxWeight(double w, double h, double d, double m) {
   // width = w;
   // height = h;
   //  depth = d;
	  super(w,h,d);	
	  weight=m;
  }

  public double getWeight() {
	return weight;
}

}
