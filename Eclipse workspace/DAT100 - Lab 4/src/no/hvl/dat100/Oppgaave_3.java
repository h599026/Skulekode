package no.hvl.dat100;

import easygraphics.*;

public class Oppgaave_3 extends EasyGraphics {
	
	final int height = 64;	// The height of the diagram element
	final int width = 256;	// the width of the diagram.
	final int xSpace = 32;	// Horizontal space
	final int ySpace = 32;	// Vertical space
	
	final double[] data = {0.72, 0.62, 0.54, 0.79};
	final String[] dataNames = { "A", "B", "C", "D"};
	final String columnName1 = "Jentar";
	final String columnName2 = "Gutar";
			
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		
		int yPos = ySpace;
		for (int i = 0; i < data.length; i++) {
			drawColumn(i, yPos);
			yPos += ySpace + height;
		}
	}
	
	void drawColumn(int index, int yPos) {

		makeWindow("test");
		
		// Draw girls column
		setColor(255, 20, 40);
		fillRectangle(xSpace, yPos, (int) (width * data[index]), height);
		
		// Draw boys column
		setColor(0, 240, 80);
		fillRectangle(xSpace + (int) (width * data[index]), yPos, (int) (width * (1 - data[index])), height);
		
		// Draw frame
		setColor(0,0,0);
		drawRectangle(xSpace - 1, yPos, width, height);
		
		// draw text
		drawString(columnName1, xSpace, yPos);
		drawString(columnName2, xSpace + width - 30, yPos);
		drawString(dataNames[index], xSpace + width / 2, yPos);
		
		// Draw percentages
		double a = (double) Math.round(data[index] * 1000) / 10;
		double b = (double) Math.round((1 - data[index]) * 1000) / 10;
		drawString(a + "%", xSpace, yPos + height + 13);
		drawString(b + "%", xSpace + width - 13, yPos + height + 13);
	}
}
