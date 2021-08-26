package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaaveB3 {

	public static void main(String[] args) {
		
		// Correct login info.
		final String correctName = "purebs";
		final String correctPassword = "123456";

		// Input login info
		String inName = showInputDialog("Enter Username");
		String inPassword = showInputDialog("Enter Password");
		
		// Test
		boolean nameExist =  inName.equals(correctName);
		boolean passwordCorrect = inPassword.equals(correctPassword);
		
		// Show result to user
		if(nameExist && passwordCorrect) {
			showMessageDialog(null, "Login successfull!");
		}
		else {

			showMessageDialog(null, "Login failed!");
		}
	}
}
