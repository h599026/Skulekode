package no.hvl.dat100;

public class O1a {
	
	public static void signOrZero(int a) {
		
		if(a < 0) {
			System.out.println(a + " er mindre enn 0");
		}
		else if(a == 0) {
			System.out.println(a + " er lik 0");
		}
		else {
			System.out.println(a + " er meir enn 0");
		}
	}
}
