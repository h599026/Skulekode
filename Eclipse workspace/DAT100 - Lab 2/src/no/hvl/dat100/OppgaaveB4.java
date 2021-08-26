package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaaveB4 {
	
	public static void main(String[] args) {

		// Lowest income for the 'trinn'
		final int trinn1 = 184800;
		final int trinn2 = 260100;
		final int trinn3 = 651250;
		final int trinn4 = 1021550;
		
		// Input income
		int income = parseInt(showInputDialog("Angi bruttoInntekt"));
		
		// Decide 'trinn'
		int trinn;
		if(income < trinn1)
			trinn = 0;
		else if (income < trinn2)
			trinn = 1;
		else if (income < trinn3)
			trinn = 2;
		else if (income < trinn4)
			trinn = 3;
		else
			trinn = 4;
		
		// Show 'trinn' to user
		showMessageDialog(null, "Du hører til trinn " + trinn);
	}
}
