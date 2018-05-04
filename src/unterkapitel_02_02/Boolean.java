package unterkapitel_02_02;

public class Boolean {
	
	public static void main (String args[]) {
		
		boolean urlaub, wochenende;
		boolean regen, schoeneswetter;
		boolean frei, picknick;
		
		urlaub = false;
		wochenende = false;
		regen = false;
		
		schoeneswetter = !regen;
		frei = urlaub | wochenende;
		picknick = frei & schoeneswetter;
		
		System.out.println("Möchtest du picknicken gehen? " + picknick);
	}
}
