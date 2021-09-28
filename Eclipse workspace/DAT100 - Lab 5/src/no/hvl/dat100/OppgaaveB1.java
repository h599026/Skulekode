package no.hvl.dat100;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.round;

public class OppgaaveB1 {

	public static void main(String[] args) {
		System.out.println("x i grader    x i radianer  sin(x)      cos(x)");
		System.out.println("----------------------------------------------");
		for(int x = 0; x <= 90; x += 15) {
			printLinje(x);
		}

	}
	
	private static void printLinje(double x) {
		
		System.out.printf("%10s %10s %10s %10s %n", x, radianar(x), sinGrader(x), cosGrader(x));
		
	}
	
	private static double radianar(double x) {
		double r = (double) (PI * x) / 180;
		return (double) round(r * 100) / 100;
		
	}
	
	private static double sinGrader(double x) {
		return (double) round(sin((double)radianar(x)) * 10)/ 10;
		
	}
	
	private static double cosGrader(double x) {
		return (double) round(cos((double)radianar(x)) * 10)/ 10;
		
	}

}
