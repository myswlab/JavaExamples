package it.unibs.ing.fp.schildt.ch8Inheritance.es6_BoxWeight;
import  it.unibs.ing.fp.Shildt.ch8.es3_Box.Box;


//*listing 6
// BoxWeight now uses super to initialize its Box attributes.
class BoxWeight extends Box {
  double weight; // weight of box

  // initialize width, height, and depth using super()
  BoxWeight(double w, double h, double d, double m) {
    super(w, h, d); // call superclass constructor
    weight = m;
  }    
}

