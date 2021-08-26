/* <algorythm-description> 
 * 
 * - Reads input from user and converts to integer.
 * 
 * - Find the number of hours using /.
 * - Remove the hours(in seconds) from total seconds.
 * 
 * - Find the number of minutes using /.
 * - Remove the minutes(in seconds) from total seconds.
 * 
 * - Using the remaining total seconds to find seconds.
 * 
 * - Show result to user.
 * 
 * */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppgaave_4 {
	
	public static void main(String[] args) {
		
		String input = showInputDialog("angi sekunder:");
		// Get input in seconds.
		int totalSeconds = parseInt(input);
					// Find hours
		int h = totalSeconds / 3600;
		// Remove hours from total seconds.
		totalSeconds = totalSeconds - h * 3600;
		
		// Find minutes.
		int m = totalSeconds / 60;
		// Remove minutes from total seconds.
		totalSeconds = totalSeconds - m * 60;
		
		// Find seconds.
		int s = totalSeconds;
			
		// Show result to user.
		showMessageDialog(null, h + " timer, " + m + " minutter, " + s + "sekunder");

	}

}
