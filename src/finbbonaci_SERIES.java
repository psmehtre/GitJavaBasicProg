
public class finbbonaci_SERIES {

	public static void main(String [] args) {
		int num1 = 1;
		int num2 = 1;
		int num =0;
		for(int i=1 ; i<=10 ; i++) {
			num = num1 + num2;
			System.out.println(num);
			num1=num2;
			num2=num;
		}
	}

}
