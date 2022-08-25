public class ExtractDIGIT {
	public static void main(String [] args) {
		String X = "darsh94an0409 Meh25tre95";
		String Y="";
		for (int i =0 ; i<X.length();i++) {
			Character c = X.charAt(i);
			if(Character.isDigit(c)) {
				Y = Y + c;
			}
		}System.out.println(Y);
	}
}