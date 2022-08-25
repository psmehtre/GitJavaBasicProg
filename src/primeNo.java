public class primeNo {
	public static void main(String args[]) {
		System.out.println("Prime Numbers are as follows - ");
		for (int i = 2; i<=20 ; i++) {
			boolean isPrime = true;
			for (int j=2 ; j<i; j++) {
				if (i%j==0) {
					isPrime = false;
					break;
				}
			}if(isPrime) {
				System.out.print( i +",");
			}
		}
	}
}