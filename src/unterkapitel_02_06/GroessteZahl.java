package unterkapitel_02_06;

public class GroessteZahl {

	public static void main(String args[]) {

		int[] zahlen = { 58, 20, -65, 98, 561 };

		int groessteZahl = zahlen[0];

		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i] > groessteZahl) {
				groessteZahl = zahlen[i];
			}
		}
		System.out.print("Die gr��te Zahl ist: " + groessteZahl);
	}
}