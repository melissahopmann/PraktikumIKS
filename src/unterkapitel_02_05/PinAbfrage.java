package unterkapitel_02_05;

import static utilities.Utilities.*;

public class PinAbfrage {

	public static void main(String args[]) {

		int pin = 1234;
		int versuche = 0;
		int eingabe;

		do {
			versuche++;
			String prompt = "PIN (" + versuche + ". Versuch): ";
			eingabe = readInt(prompt);
		} while (versuche < 3 && eingabe != pin);

		if (eingabe == pin) {
			System.out.println("Zugriff gewährt!");
		} else {
			System.out.println("Zugriff verweigert!");
		}
	}

}
