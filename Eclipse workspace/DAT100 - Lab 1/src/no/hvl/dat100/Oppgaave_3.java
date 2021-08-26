package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgaave_3 {

	public static void main(String[] args) {
		
		// Get input from user
		String day = showInputDialog("Dag");
		String month = showInputDialog("måned");
		String year = showInputDialog("år");
		
		// Show combined date to user
		showMessageDialog(null, "Datoen du tastet inn: " + day + "." + month+ "." + year);
	}
}
