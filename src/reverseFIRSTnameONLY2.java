public class reverseFIRSTnameONLY2 {

	public static void main(String [] args) {
		String x = "Darshan Mehtre";
		String y = "";
		String z = "";	
		for (int i = x.length()-8 ; i>=0; i--) {
			y = y + x.charAt(i);
		}for (int i = 8 ; i<x.length(); i++) {
			z = z + x.charAt(i);
		}	x = y + " " + z;
		System.out.println(x);
	}
}