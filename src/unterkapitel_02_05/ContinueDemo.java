package unterkapitel_02_05;

public class ContinueDemo {
	
	public static void main (String args []) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.println(i + " ist durch 7 teilbar.");
		}
	}
}	