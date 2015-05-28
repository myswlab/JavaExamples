package it.unibs.ing.fp.esercizi_lezione.ricorsione;

public class Fattoriale {
     
	public static long iterativeFactorial(int num) {
        long result = 1;
        if(num <= 0) {
            return 1;
        }
        else {
            for(int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
	}
	
	public static long recursiveFactorial(int num) {
        if(num <= 0) {
            return 1;
        }
        else {
            return num * recursiveFactorial(num - 1);
        }
    }
	public static void main(String args[]) {
	      int a =20;
		  if (args.length > 0) {
			    try {
			        a = Integer.parseInt(args[0]);
			    } catch (NumberFormatException e) {
			        System.err.println("Argument" + args[0] + " must be an integer.");
			  
			    }
			}
		  System.out.println("a: "+a);
			
	      long startTimeMs = System.currentTimeMillis( );
          long iter=iterativeFactorial(a);
          long endTimeMs = System.currentTimeMillis( );
          System.out.println("Iterativo: "+ iter+" time:" + (endTimeMs-startTimeMs)+ " ms");
      
          startTimeMs = System.currentTimeMillis( );
          long ric= recursiveFactorial(a);
          endTimeMs = System.currentTimeMillis( );
          
          System.out.println("Ricorsivo: "+ ric+" time:"+ (endTimeMs-startTimeMs) +" ms");
          	      
	}
}
