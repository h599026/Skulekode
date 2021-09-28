package no.hvl.dat100;

public class OppgaaveG {
	
	public static void main(String[] args) {
		// a)
		int[] tabell = {1, 3, 4, 7, 9, 10};
		// b)
		System.out.println(tabell[2]);
		// c)
		tabell[2] = 7;
		// e)
		skrivUt(tabell);
		// g)
		System.out.println(finnes(tabell, 11));
		// h)
		skrivUt(skiftForteikn(tabell));
		skrivUt(tabell);
		
	}
	
	private static void skrivUt(int[] tabell) {
		// d)
		/*
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
			
		}*/
		// 
		for(int tall: tabell) {
			System.out.print(tall + " ");
		}
		System.out.println();
		
	}
	
	private static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		while(true) {
			if(i >= tabell.length)
				break;
			if (tabell[i] == tall)
				return true;
			i++;
		}
		return false;
	}
	
	private static int[] skiftForteikn(int[] org) {
		int[] ny = org.clone();
		for(int i = 0; i < ny.length; i++) {
			ny[i] = -ny[i];
		}
		return ny;
	}
}
