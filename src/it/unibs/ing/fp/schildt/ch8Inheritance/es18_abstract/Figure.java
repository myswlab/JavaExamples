package it.unibs.ing.fp.schildt.ch8Inheritance.es18_abstract;

//*listing 18
// Using abstract methods and classes.
abstract class Figure {
  double dim1;
  double dim2; 

  Figure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  // area is now an an abstract method 
  abstract double area();
}

