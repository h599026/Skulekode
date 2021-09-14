package no.hvl.dat100;

public class O4 {
	
	public static double minimum(double a, double b, double c) {
		double m = a;
		if(b < m)
			m = b;
		if(c < m)
			m = c;
		return m;
	}
	
	public static void main(String[] args) {
		double a = 6, b = 4, c = 9;
		
		System.out.print(minimum(a, c, b));
	}
}


