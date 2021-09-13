package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B2_2 {

	public static void main(String args) {
		
		// Get Input
		int x = parseInt(showInputDialog("Angi grunntal"));
		double n; do { n = parseDouble(showInputDialog("Angi ein positiv potens")); } while (n <= 0);
		
		// Calculation using Math library
		double ans1 = Math.pow(x, n);
		
		// Calculation using for loop
		double ans2 = 1;
		for(int i = 0; i <= n; i++) {
			ans2 *= x;
		}
		
		// Show answer
		showMessageDialog(null,
				"Svar med bruk av Math biblioteket: " + x + "^" + n + " = " + ans1 + 
				"\nSvar med bruk av for loop: " + x + "^" + n + " = " + ans2);
	}
}