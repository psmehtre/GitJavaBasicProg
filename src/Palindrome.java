public class Palindrome {
	public static void main(String args[]) {
		String x = "SAS";
		String y = "";
		for(int i = x.length()-1 ; i>=0 ; i--) {
			y = y + x.charAt(i);
		}if (x.equals(y)) {
			System.out.println("The given is Palindrome");
		}else{
			System.out.println("The given is not Palindrome");
		}
	}
}