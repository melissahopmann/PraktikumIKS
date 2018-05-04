package unterkapitel_02_02;

import java.util.Scanner;

public class KommaDemo1 {
	
	public static void main (String args []) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib an, wie warm es in Grad Celsius ist: ");
		
		double tempCelsius, tempFahrenheit;
		tempCelsius = scanner.nextDouble();
		tempFahrenheit = tempCelsius * 1.8 + 32;
		tempFahrenheit = (long)(tempFahrenheit * 100) / 100d;
		
		System.out.print("Bei dir herrschen " + tempCelsius + " Grad Celsius.");
		System.out.println(" Dies entspricht " + tempFahrenheit+ " Grad Fahrenheit.");
		
		
		scanner.close();
	}

}
