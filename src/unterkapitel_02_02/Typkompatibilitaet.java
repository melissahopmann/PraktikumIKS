package unterkapitel_02_02;

import java.util.Scanner;

public class Typkompatibilitaet {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		int anzahlArtikel;
		float kostenArtikel = 13.99f;
				
		System.out.print("Gib die Anzahl deiner gekauften Artikel ein: ");
		anzahlArtikel = scanner.nextInt();
		
		float gesamtkosten = anzahlArtikel * kostenArtikel;
				
		System.out.println("Dein Gesamtpreis beträgt: "+gesamtkosten);
		
		scanner.close();
	}

}
