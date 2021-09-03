package no.hvl.dat100;

import javax.swing.JOptionPane;
import java.lang.Double;
import java.lang.Math;

public class OppgaaveB1 {

	public static void main(String[] args) {
		
		double r = Double.parseDouble(JOptionPane.showInputDialog("Radius:"));
		double v = (4 / 3) * Math.PI * Math.pow(r, 3);
		JOptionPane.showMessageDialog(null, "Volumet er " + (double) Math.round(v * 100) / 100);
	}
}
