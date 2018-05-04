package unterkapitel_02_01;

import java.util.Scanner;

public class Altersumrechnung {
	
	public static void main (String args []) {
		
		int alterInJahren;
		int alterInStunden;
		int alterInMinuten;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte gib Deinen Namen ein: ");
		name = scanner.nextLine();

		System.out.print("Bitte gib dein Alter ein: ");
		alterInJahren = scanner.nextInt();

		alterInStunden = alterInJahren * 365 * 24;
		
		alterInMinuten = alterInStunden * 60;
		
		System.out.println ("Hallo " + name + "!");
		System.out.println (alterInJahren + " Jahre entsprechen " + alterInStunden + " Stunden.");
		System.out.println ("Das sind " + alterInMinuten + " Minuten.");
		
		scanner.close();
	}

}
