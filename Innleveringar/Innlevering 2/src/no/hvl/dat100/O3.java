package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O3 {

	public static void main(String[] args) {
		
		// Get a positive integer from user.
		// (numbers over 40 will make the result too big for a 64 bit integer)
		int n;
		do {
			n = parseInt(showInputDialog("Skriv inn eit positivt heiltal under 40"));
		} while ( n <= 0 || n >= 40);
		
		// Do the calculation using a for loop
		long result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		// Show result to user
		showMessageDialog(null, n + "! = " + result);
	}
	
}
