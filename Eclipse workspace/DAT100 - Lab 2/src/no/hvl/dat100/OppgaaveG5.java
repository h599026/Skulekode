package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;;

public class OppgaaveG5 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {

			int number = parseInt(showInputDialog("Skriv eit tall"));
			System.out.println(number);
		}
	}
}
