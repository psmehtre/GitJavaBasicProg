public class reverseFIRSTnameONLY {
	
	public static void main(String [] args) {
		String x = "Darshan Mehtre";
		String Array[] = x.split(" ");
		String y = Array [0];
		String z = Array [1];
		String D = "";
		for (int i = y.length()-1 ; i>=0; i--) {
			D = D + y.charAt(i);
		}D = D + " " + z;
		System.out.println(D);
	}
}