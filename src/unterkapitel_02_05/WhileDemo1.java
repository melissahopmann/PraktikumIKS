package unterkapitel_02_05;

public class WhileDemo1 {
	
	public static void main (String args []) {
		 
	     int basis = 6;
	     int exponent = 2;
	     
	     int ergebnis = 1;
	     int zaehler = exponent;
	 
	     while (zaehler > 0) {
	    	 ergebnis *= basis;
	    	 zaehler--;
	     }
	    
	     System.out.print (basis + " hoch " +exponent+ " ergibt "+ergebnis);
	}
}