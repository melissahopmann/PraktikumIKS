package unterkapitel_02_06;

public class ArrayDemo1 {
	
	public static void main (String args[]) {
		
		double [] zahlen;
		
		zahlen = new double [3];
				
		zahlen [0] = 4.0;
		zahlen [1] = 3.0;
		zahlen [2] = zahlen [0] * 2;
		
		System.out.println ("erstes Element enth�lt: "+zahlen[0]);
	    System.out.println ("zweites Element enth�lt: "+zahlen 
	       [1]);
	    System.out.println ("drittes Element enth�lt: "+zahlen 
	       [2]); 
	}

}
