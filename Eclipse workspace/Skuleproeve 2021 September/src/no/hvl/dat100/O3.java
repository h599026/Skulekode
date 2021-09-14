package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class O3 {

	public static void main(String[] args) {
		
		String message = "Angi tall\n(avslutt med verdien 0)";
		int sum = 0;
		int antall = 0;
		int input = parseInt(showInputDialog(message));
		
		while (input != 0) {
			sum += input;
			antall++;
			input = parseInt(showInputDialog(message));
		}

		System.out.println("Antall tall: " + antall);
		System.out.println("Sum: " + sum);
	}
}


