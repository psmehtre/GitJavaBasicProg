public class first20EVENandODD {

	public static void main(String args[]) {
		System.out.print("The first 20 even nos. are - ");
		for (int i = 2; i<=20; i=i+2) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		System.out.print("The first 20 odd nos. are - ");
		for (int i = 1; i<=20; i=i+2) {
			System.out.print(i + ",");
		}
	}
}