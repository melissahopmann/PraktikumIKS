package unterkapitel_02_05;

public class BreakDemo {
	
	public static void main (String args []) {
		
		long zahl = 20L;
		
		System.out.print (zahl + " ist ");
		
		for (long i = 2; i < zahl; i++) {
			if (zahl % i == 0) {
				System.out.print (" keine ");
				break;
			}
		}
		
		System.out.println(" Primzahl!");
	}
}
