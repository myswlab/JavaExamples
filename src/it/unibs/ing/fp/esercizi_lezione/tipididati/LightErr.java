package it.unibs.ing.fp.esercizi_lezione.tipididati;
// Compute distance light travels using int variables.
class LightErr {
	public static void main(String args[]) {
		int lightspeed;
		int days;
		int seconds;
		int distance;

		// approximate speed of light in miles per second
		lightspeed = 186000;

		days = 1000; // specify number of days here

		seconds = days * 24 * 60 * 60; // convert to seconds

		distance = lightspeed * seconds; // compute distance

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}
