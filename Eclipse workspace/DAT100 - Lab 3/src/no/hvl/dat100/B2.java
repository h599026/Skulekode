package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class B2 {
	
	public static void main(String[] args) {
		
		// Get Input
		double x = parseDouble(showInputDialog("Angi grunntal"));
		int n; do n = parseInt(showInputDialog("Angi ein positiv exponent")); while (n <= 0);
		
		// Calculation using Math library
		double ans1 = Math.pow(x, n);
		
		// Calculation using for loop
		double ans2 = 1;
		for(int i = 0; i < n; i++) {
			ans2 *= x;
		}
		
		// Show answer
		showMessageDialog(null,
			"Under er potensen " + x + "^" + n + " rekna ut på to måter.\n\n" + 
			"Math.pow metode:\n" + x + "^" + n + " = " + ans1 + "\n\n" +
			"for-loop metode:\n" + x + "^" + n + " = " + ans2);
		
	}
	
}
