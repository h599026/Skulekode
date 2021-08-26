package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static java.lang.Math.*;

public class OppgaaveB1 {

	public static void main(String[] args) {
		
		double r = parseDouble(showInputDialog("Radius:"));
		double v = (4 / 3) * PI * pow(r, 3);
		showMessageDialog(null, "Volumet er " + (double)round(v * 100) / 100);
	}
}
