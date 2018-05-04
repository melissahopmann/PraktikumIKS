package unterkapitel_02_07;

public class EinfacheMethoden {
	
	public static void main (String args[]) {
		willkommen();
		System.out.println("Schön, dass Sie da sind!");
		aufWiedersehen();
	}
	
	public static void aufWiedersehen () {
		for (int i = 0; i < 2; i++) {
			System.out.print("Bye ");
		}
	}
	
	public static void willkommen() {
		System.out.print("Hallo ");
		System.out.println("und herzlich willkommen!");
	}
}