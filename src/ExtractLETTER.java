public class ExtractLETTER {
	public static void main(String [] args) {
		String X = "1234darshan";
		String Y="";
		for (int i =0 ; i<X.length();i++) {
			if(Character.isLetter(X.charAt(i))) {
				Y = Y + X.charAt(i);
			}
		}System.out.println(Y);
	}
}