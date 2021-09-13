package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class G1 {

	public static void main(String[] args) {

		// Input from user.
		int n = parseInt(showInputDialog("Skriv eit nummer"));

		// Loop & print
		for(int i = 1; i < n; i++) {
			System.out.print(i + " ");
		}
		
		// [n < 0 causes the loop to repeat zero times]
	}

}
