package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;;

public class O2 {

	public static void main(String[] args) {

		// Get how many times it should repeat from user input.
		int repeat = parseInt(showInputDialog("Angi antall prøver"));
		
		// Loop
		for(int i = 0; i < repeat; i++) {
			
			// Ask for score.
			int score = parseInt(showInputDialog("Angi poengsum"));
			
			// check if input is Illegal.
			if(score < 0 || score > 100) {

				showMessageDialog(null, "Ugyldig poengsum. (0 <= x <= 100)\nPrøv på nytt");
				i--;
			}
			// Check what grade the student got and show result to user
			else if (score <= 100 && score >= 90)
				showMessageDialog(null, "Karakter A");
			else if (score <= 89 && score >= 80)
				showMessageDialog(null, "Karakter B");
			else if (score <= 79 && score >= 60)
				showMessageDialog(null, "Karakter C");
			else if (score <= 59 && score >= 50)
				showMessageDialog(null, "Karakter D");
			else if (score <= 49 && score >= 40)
				showMessageDialog(null, "Karakter E");
			else if (score <= 39 && score >= 0)
				showMessageDialog(null, "Karakter F");
			
		}
			
	}

}
