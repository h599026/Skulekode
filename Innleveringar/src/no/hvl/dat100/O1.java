package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O1 {
	
	public static void main(String[] args) {

		// Lowest income for the 'trinn'
		final int trinn1 = 184800;
		final int trinn2 = 260100;
		final int trinn3 = 651250;
		final int trinn4 = 1021550;

		// The tax percentages for each 'trinn'
		final float trinnskatt0 = 0.0f;
		final float trinnskatt1 = 1.7f;
		final float trinnskatt2 = 5.0f;
		final float trinnskatt3 = 13.2f;
		final float trinnskatt4 = 16.2f;

		// Message before and after the tax percentage.
		final String prefix = "Din trinnskatt er på ";
		final String suffix = "%";
		
		// Input income
		int income = parseInt(showInputDialog("Angi bruttoInntekt"));
		
		// Decide 'trinn' and show result to user
		if(income < trinn1)
			showMessageDialog(null, prefix + trinnskatt0 + suffix);
		else if (income < trinn2)
			showMessageDialog(null, prefix + trinnskatt1 + suffix);
		else if (income < trinn3)
			showMessageDialog(null, prefix + trinnskatt2 + suffix);
		else if (income < trinn4)
			showMessageDialog(null, prefix + trinnskatt3 + suffix);
		else
			showMessageDialog(null, prefix + trinnskatt4 + suffix);
	}
}
