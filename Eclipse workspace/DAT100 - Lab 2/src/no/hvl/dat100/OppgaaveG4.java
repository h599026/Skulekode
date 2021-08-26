package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaaveG4 {

	public static void main(String[] args) {
		// Get values
		int a = parseInt(showInputDialog("value a"));
		int b = parseInt(showInputDialog("value b"));
		
		if(b == 0) {
			showMessageDialog(null, "Kan ikkje dele på 0");
		}
		else {
			showMessageDialog(null, a / b);
		}
	}
}
