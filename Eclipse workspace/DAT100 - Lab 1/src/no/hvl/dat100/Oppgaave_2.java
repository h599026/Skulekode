package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Oppgaave_2 {

	public static void main(String[] args) {

		// Get user input
		int in1 = parseInt(showInputDialog("Første nummer:"));
		int in2 = parseInt(showInputDialog("Andre nummer:"));
		int in3 = parseInt(showInputDialog("Tredje nummer:"));
		int in4 = parseInt(showInputDialog("Fjerde nummer:"));
		
		// Calculate minimum
		int minInt = min(in1,min(in2, min(in3, in4)));
		
		// Show result to user
		showMessageDialog(null, "The smallest number you entered was: " + minInt);
	}

}
