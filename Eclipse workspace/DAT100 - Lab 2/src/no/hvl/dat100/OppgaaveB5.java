package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;;

public class OppgaaveB5 {

	public static void main(String[] args) {

		int repeat = parseInt(showInputDialog("Angi antall prøver"));
		
		for(int i = 0; i < repeat; i++) {
			
			int poeng = parseInt(showInputDialog("Angi poengsum"));
			int grade;
			
			if(poeng < 0 || poeng > 100) {

				showMessageDialog(null, "Ugyldig poengsum. (0 <= x <= 100)\nPrøv på nytt");
				i--;
			}
			else if (poeng <= 100 && poeng >= 90)
				showMessageDialog(null, "Karakter A");
			else if (poeng <= 89 && poeng >= 80)
				showMessageDialog(null, "Karakter B");
			else if (poeng <= 79 && poeng >= 60)
				showMessageDialog(null, "Karakter C");
			else if (poeng <= 59 && poeng >= 50)
				showMessageDialog(null, "Karakter D");
			else if (poeng <= 49 && poeng >= 40)
				showMessageDialog(null, "Karakter E");
			else if (poeng <= 39 && poeng >= 0)
				showMessageDialog(null, "Karakter F");
			
		}
			
	}

}
