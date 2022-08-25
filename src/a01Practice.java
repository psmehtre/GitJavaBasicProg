public class a01Practice {
	public static void main(String args[]){
		a01Practice main = new a01Practice();
 
		System.out.println("reverse first name only");
		//access 1st methods
		main.rev1stname();
		System.out.println("------------------------------------------------------");


		System.out.println("reverse a string");
		//access 2nd method
		main.reverse();
		System.out.println("------------------------------------------------------");


		System.out.println("check the string palindrome or not");
		//access 3rd method
		main.palindrome();
		System.out.println("------------------------------------------------------");


		System.out.println("extract the digits from the string");
		//access 4th method
		main.extractDIGIT();
		System.out.println("------------------------------------------------------");	


		System.out.println("create fibbonaci series for 1st 10 nos.");
		//access 5th method
		main.fibbonaciSeries();
		System.out.println("------------------------------------------------------");	

		System.out.println("create division series");
		//access 6th method
		main.divisionSeries();
		System.out.println("------------------------------------------------------");	

		System.out.println("create sum of even series");
		//access 7th method
		main.sumOFseries();
		System.out.println("------------------------------------------------------");	


	}


	public void rev1stname() {	
		String x = "darshan mehtre";
		String [] array = x.split(" ");
		String y =array [0];
		String z =array [1];
		String d ="";
		System.out.println("string is = "+ x);
		for(int j=y.length()-1 ; j>=0 ; j--){
			d = d + y.charAt(j);
		}d = d+ " " + z;
		System.out.println(d);
	} 


	public void reverse(){
		String x1 = "darsman mehtre";
		String d1 ="";
		System.out.println("string is = "+ x1);
		for(int i=x1.length()-1 ; i>=0 ; i--){
			d1 = d1 + x1.charAt(i);
		}System.out.println(d1);
	}


	public void palindrome(){
		String x2 = "sos";
		String d2 = "";
		System.out.println("string is = "+ x2);
		for(int k=x2.length()-1; k>=0 ; k--){
			d2 = d2 + x2.charAt(k);
		}if(x2.equals(d2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

	public void extractDIGIT() {
		String x3 = "darshan1234 mehtre5678";
		String d3 = "";
		System.out.println("string is = "+ x3);
		for(int m=0 ; m<x3.length() ; m++) {
			Character c = x3.charAt(m);
			if(Character.isDigit(c)) {
				d3 = d3 + c;
			}}System.out.println(d3);
	}

	public void fibbonaciSeries() {
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

	public void divisionSeries() {
		int Numarator = 0;
		int Denominator = 0;
		for (int i=1 ; i<=10 ; i++) {
			Numarator =i;
			Denominator = i+1;
			System.out.println(Numarator +"/"+Denominator);
		}
	}

	public void sumOFseries() {

		//		WAP for output is sum=2+4+6+8+10....
		int n = 1;
		for(int i=1; i<=10; i++) {
				n=i;
			if(i%2==0) {
				System.out.print(n + "+");
			}
		}System.out.println();


		//WAP for output is 2-4+6-8+10-12....
		//		int count =1;
		//		for(int i=1;i<=10;i++) {
		//			if(i%2==0) {
		//				if(count%2==0) {
		//					System.out.print(-i+",");
		//				}else {
		//					System.out.print(i+",");
		//				}count = count +1;
		//			}
		//		}System.out.println();



		//		//Alternate letters upper & lower
			//output= DaRsHaN ShRiRaM MeHtRe
		//		String x = "darshan shriram mehtre";
		//		String y = "";
		//		for (int i=0 ; i<x.length() ;i++) {
		//				if(i%2==0) {
		//					y=y+Character.toUpperCase(x.charAt(i));
		//				}else {
		//					y=y+Character.toLowerCase(x.charAt(i));
		//				}	
		//		}System.out.println(y);


		//		//fibbonacci series upto 1st 10 digits
		//		int num1=1;
		//		int num2=1;
		//		int num =0;
		//		for (int i=1; i<=10 ; i++) {
		//			num= num1+num2;
		//			System.out.print(num + ",");
		//			num1=num2;
		//			num2=num;
		//		}



		//		//EVEN & ODD no. 
		//		System.out.println("these are even nos. = ");
		//		for(int i=1; i<=10;i++) {
		//			if(i%2==0) {
		//				System.out.print(i+",");
		//			}
		//		}System.out.println();
		//		
		//		
		//		
		//		System.out.println("these are odd nos. = ");
		//		for(int i=1; i<=10;i++) {
		//			if(i%2==1) {
		//				System.out.print(i+",");
		//			}
		//		}System.out.println();
		//		
		//		
		//		
		//		System.out.println("this is table of 5 = ");
		//		for(int i=1; i<=50;i++) {
		//			if(i%5==0) {
		//				System.out.println(i);
		//			}
		//		}


	}
}