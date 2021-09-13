package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class B1 {

	public static void main(String[] args) {
		
		// Get limit from input
		int min = parseInt(showInputDialog("Angi ei nedre grense")), max = parseInt(showInputDialog("Angi ei øvre grense"));

		// a String to store all numbers
		String result = "";
		
		// Add numbers to result string
		for(int i = min; i <= max; i++) {
			if(i % 2 == 1)
				result += i + ", ";
		}
		// remove last ','
		result = result.substring(0, result.length() - 2);
		
		// Show result
		showMessageDialog(null, result);
	}

}
