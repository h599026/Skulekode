package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgaave_1 {
	
	public static void main(String[] args) {
		
		// Input first integer
		String lengthTxt = showInputDialog("Lengde");
		int length = parseInt(lengthTxt);
		
		// Input second integer
		String heightTxt = showInputDialog("Bredde");
		int height = parseInt(heightTxt);
		
		// Calculate
		int result = length * height;
		
		// Show result to user
		showMessageDialog(null, result);
	}
	
}
