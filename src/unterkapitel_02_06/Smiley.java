package unterkapitel_02_06;

public class Smiley {

	public static void main(String args[]) {

		int[][] magQuadrat = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 12, 2 } };
		int nSpalten = magQuadrat.length;
		int nZeilen = magQuadrat[0].length;

		int summe = 0;

		// Bestimmung der überall geforderten Summe:
		for (int spalte = 0; spalte < nZeilen; spalte++) {
			summe += magQuadrat[0][spalte];
		}
		System.out.println("Summe: " + summe);

		// Prüfe alle Zeilensummen

		for (int zeile = 0; zeile < nZeilen; zeile++) {
			int zeilensumme = 0;

			for (int spalte = 0; spalte < nSpalten; spalte++) {
				zeilensumme += magQuadrat[zeile][spalte];
			}

			if (zeilensumme != summe) {
				System.out.println("Falsch");
				System.exit(-1);
			}
		}

		// Prüfe alle Spaltensummen

		for (int spalte = 0; spalte < nSpalten; spalte++) {
			int spaltensumme = 0;

			for (int zeile = 0; zeile < nZeilen; zeile++) {
				spaltensumme += magQuadrat[zeile][spalte];
			}

			if (spaltensumme != summe) {
				System.out.println("Falsch");
				System.exit(-1);
			}
		}

		// Prüfe Diagonale 1 (rechts oben nach links unten)

		int diagonalsumme = 0;

		for (int zeilespalte = 0; zeilespalte < nSpalten; zeilespalte++) {
			diagonalsumme += magQuadrat[zeilespalte][zeilespalte];
		}

		if (diagonalsumme != summe) {
			System.out.println("Falsch");
			System.exit(-1);
		}

		// Prüfe Diagonale 2 (links oben nach rechts unten)
		
		int gegendiagsumme = 0;
		
		for (int x = nSpalten-1, y = 0; x >= 0 & y < nSpalten ; x--, y++) {
			gegendiagsumme += magQuadrat[x][y];
		}
		
		if (gegendiagsumme != summe) {
			System.out.println("Falsch");
			System.exit(-1);
		}

		System.out.println("Es handelt sich um ein magisches Quadrat.");
	}

}
