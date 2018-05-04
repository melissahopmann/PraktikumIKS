package unterkapitel_02_06;

import java.util.Scanner;

public class ArrayDemo2 {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		
		int anzahl;
		int [] z;
		float durchschnitt = 0;
		
		System.out.print("Wie viele Werte möchten Sie eingeben? ");
		anzahl = scanner.nextInt();
		
		z = new int [anzahl];
		
		for (int i = 0; i < anzahl; i ++) {
			System.out.print("Bitte geben Sie ");
			System.out.print("die " + (i+1)+". Zahl ein: ");
			z[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < anzahl; i++) {
			durchschnitt += z[i];
		}
		
		durchschnitt /= anzahl;
		
		System.out.print("Der Durchschnittswert Ihrer Eingaben beträgt: " + durchschnitt);
		
		scanner.close();
	}

}
