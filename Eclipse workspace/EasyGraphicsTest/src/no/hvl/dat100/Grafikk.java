package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void run() {
		makeWindow("Grafikk", 100, 180);
		drawCircle(50, 50, 40);
		drawCircle(50, 130, 40);
		
	}
}
