package it.unibs.ing.fp.esercizi_lezione.ereditarieta;

public class SandwitchMain {

	public static void main(String[] args) {
	    new Sandwich();
	  }
}

class Meal {
	Meal() { System.out.println("Meal()"); }
}
class Bread {
	Bread() { System.out.println("Bread()"); }
}
class Cheese {
	Cheese() { System.out.println("Cheese()"); }
}
class Salade {
	Salade() { System.out.println("Salade()"); }
}
class Lettuce extends Salade {
	Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()");}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}
class Sandwich extends PortableLunch {

	Bread b ;  //= new Bread();
	Cheese c ; //= new Cheese();
	Lettuce l; //= new Lettuce();

	Sandwich() { 
		b = new Bread();
		c = new Cheese();
		l = new Lettuce();
		System.out.println("Sandwich()");
 	}
 	
}