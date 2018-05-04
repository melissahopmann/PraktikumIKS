package unterkapitel_02_03;

import java.util.Scanner;

public class IfDemo1 {
	
	public static void main (String args []) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie ein Zahl an: ");
		int zahl = scanner.nextInt();
		
		if (zahl % 2 == 0) {
			System.out.println("Die Zahl ist gerade!");
		} else {
			System.out.println("Die Zahl ist ungerade!");
		}
		
		scanner.close();
	}

}
