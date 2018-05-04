package unterkapitel_02_07;

public class Potenz {

	public static void main(String args[]) {

		System.out.println(potenz(5, 2));
	}

	public static int potenz(int a, int b) {
		int ergebnis = 1;
		for (int i = 0; i < b; i++)
			ergebnis *= a;
		return ergebnis;
	}

}
