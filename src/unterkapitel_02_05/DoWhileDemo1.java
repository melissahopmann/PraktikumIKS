package unterkapitel_02_05;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main (String args []) {

		Scanner scanner = new Scanner(System.in);
		
		int alter;
		
		do {
			System.out.print("Geben Sie Ihr Alter an: ");
			alter = scanner.nextInt();
		} while (alter < 6 || alter > 99);
		
		System.out.println("Sie sind " + alter + " Jahre alt.");
		System.out.println("Das sind " + (alter*365) + " Tage.");
		scanner.close();
	}
}
