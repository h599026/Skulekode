package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import easygraphics.*;

public class Oppgaave_6 extends EasyGraphics {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		
		makeWindow("Det franske flagget");

		// Get flag scale from user
		int scale = parseInt(getText("// Angi størrelse på flagget //"));
	  
		// Calculate position values
		int startX = 50 * scale / 100;
	  	int startY = 50 * scale / 100;
	  
	  	// Calculate scale values
	  	int width = 300 * scale / 100;
	  	int height = 75 * scale / 100;
	  
	  	// Draw flag
	  	setColor(0, 0, 0);
	  	fillRectangle(startX, startY + 0 * height, width , height);
	  	setColor(255, 0, 0);
	  	fillRectangle(startX, startY + 1 * height, width, height);
	  	setColor(255, 220, 0);
	  	fillRectangle(startX, startY + 2 * height, width, height);
	}

}