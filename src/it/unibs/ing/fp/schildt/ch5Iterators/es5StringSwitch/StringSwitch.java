package it.unibs.ing.fp.schildt.ch5Iterators.es5StringSwitch;

// Use a string to control a switch statement.

class StringSwitch {
  public static void main(String args[]) {

    String str = "Two";

    switch(str.toLowerCase()) {
      case "one":
        System.out.println("one");
        break;
      case "two": 
        System.out.println("two");
        break;
      case "three":
        System.out.println("three");
        break;
      default: 
        System.out.println("no match");
        break;
    }
  }
}

