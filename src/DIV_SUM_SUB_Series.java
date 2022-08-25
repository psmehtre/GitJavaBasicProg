
public class DIV_SUM_SUB_Series {

	public static void main(String [] args) {
		//division series
		int Numarator = 0;
		int Denominator = 0;
		for (int i=1 ; i<=10 ; i++) {
			Numarator =i;
			Denominator = i+1;
			System.out.println(Numarator +"/"+Denominator);
		}
		System.out.println("************************************************");

		//WAP for output is sum=2+4+6+8+10....
		int n = 1;
		for(int i=1; i<=10; i++) {
			n=i;
			if(i%2==0) {
				System.out.print(n + "+");
			}
		}System.out.println();
		System.out.println("************************************************");


		//WAP for output is 2-4+6-8+10-12....
		int count =1;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				if(count%2==0) {
					System.out.print(-i+",");
				}else {
					System.out.print(i+",");
				}count = count +1;
			}
		}System.out.println();

		System.out.println("************************************************");

	}
}
