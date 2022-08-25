
public class classMETHOD {

	public static void main(String[] args) {
		classMETHOD hw = new classMETHOD();
		hw.div(20, 6.9);
		double mul = hw.mul(15, 6.8);
		System.out.println("the multiplication of above is "+ mul );

	}

	//AccessModifier ReturnType MethodName (argument1, argument2){
	//		Statement1.....
	//		Statement2.....
	// }

	public void div(int a , double d) {
		System.out.println("Value of A is " + a);
		System.out.println("Value of B is " + d);
		float c = (float) (a / d) ;
		System.out.println("the division of above is "+ c );
	}
	public double mul(int a , double b) {
		System.out.println("Value of A is " + a);
		System.out.println("Value of B is " + b);
		double c = a * b;
		return c;
	}
}
