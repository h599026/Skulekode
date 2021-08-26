package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaaveB2 {
	
	public static void main(String[] args) {

		// Get values from user
		int price = parseInt(showInputDialog("Angi pris"));
		int payed = parseInt(showInputDialog("Angi betalt"));
		
		// Calculate total change
		int change = payed - price;
		
		// Calculate individual coins
		int tens = change / 10;
		int ones = change % 10;
		
		// Show result to user
		showMessageDialog(null, "Du får tilbake " + tens + " tikroning(er) og " + ones + " einkroning(er)");
	}
}