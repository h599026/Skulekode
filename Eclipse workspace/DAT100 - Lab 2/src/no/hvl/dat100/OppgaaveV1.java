package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaaveV1 {
	public static void main(String[] args) {
		
		// Get Input
		int num1 = parseInt(showInputDialog("F�rste nummer:"));
		int num2 = parseInt(showInputDialog("F�rste nummer:"));
		int num3 = parseInt(showInputDialog("F�rste nummer:"));
		
		// Sort
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// Show result
		showMessageDialog(null, num1 + " " + num2 + " " + num3 );
		
	}
}
