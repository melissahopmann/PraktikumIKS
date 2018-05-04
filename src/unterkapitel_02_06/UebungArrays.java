package unterkapitel_02_06;

import java.util.Scanner;

public class UebungArrays {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int anzahl;
		int [] zahlen;
		float durchschnitt = 0;
		
		System.out.print("Wie viele Zahlen möchten Sie angeben?: ");
		anzahl = scanner.nextInt();
		
		zahlen = new int [anzahl];
		
		for (int i = 0; i<anzahl; i++) {
			System.out.print("Bitte geben Sie die " + (i+1) + ". Zahl ein: ");
			zahlen[i] = scanner.nextInt();
		}
		
		for (int i = 0; i<anzahl; i++) {
			durchschnitt += zahlen[i];
		}
		
		durchschnitt /= anzahl;
		
		System.out.println("Der Durchschnitt Ihrer Werte beträgt: " + durchschnitt);
		
		scanner.close();
	}

}
