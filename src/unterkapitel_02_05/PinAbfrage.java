package unterkapitel_02_05;

import java.util.Scanner;

public class PinAbfrage {
	
	public static void main (String args []) {

		Scanner scanner = new Scanner(System.in);
		
		int pin = 1234;
		int versuche = 0;
		int eingabe;
		
		do {
			versuche++;
			System.out.print("PIN ("+versuche+". Versuch): ");
			eingabe = scanner.nextInt();
		} while (versuche < 3 && eingabe != pin);
		
		if (eingabe == pin) {
		System.out.println("Zugriff gewährt!");
		}
		else {
			System.out.println("Zugriff verweigert!");
		}
		
		scanner.close();
	}
}
