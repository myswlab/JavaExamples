package it.unibs.ing.fp.esercizi_lezione.ricorsione;

public class Fibonacci {

	 //Iteration method
    static long fibIteration(int n) {
        long x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive method
    static long fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
	
	public static void main(String[] args) {
		int a =30;
		if (args.length > 0) {
		    try {
		        a = Integer.parseInt(args[0]);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + args[0] + " must be an integer.");
		  
		    }
		}
		System.out.println("a: "+a);
		long startTimeMs = System.currentTimeMillis( );
        long iter=fibIteration(a);
        long endTimeMs = System.currentTimeMillis( );
        System.out.println("Iterativo: "+ iter+" time:" + (endTimeMs-startTimeMs)+ " ms");
    
        startTimeMs = System.currentTimeMillis( );
        long ric= fibRecursion(a);
        endTimeMs = System.currentTimeMillis( );
        
        System.out.println("Ricorsivo: "+ ric+" time:"+ (endTimeMs-startTimeMs) +" ms");
    
	}

}
