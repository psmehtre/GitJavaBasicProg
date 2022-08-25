import java.util.HashMap;
import java.util.Map;

class a02_Practice {
	public static void main(String[] args) {
		//        //alternate letters uppercase & lowerCase
		//        String x = "darshan mehtre";
		//        String y ="";
		//         for (int i=0 ; i<x.length() ; i++){
		//             if(i%2==0){
		//                 y=y+Character.toUpperCase(x.charAt(i));
		//             }else{
		//                 y=y+Character.toLowerCase(x.charAt(i));
		//             }
		//         }System.out.println(y);


		//        //reverse a string
		//        String x = "darshan mehtre";
		//         String y = "";
		//         for(int i=x.length()-1; i>=0; i--){
		//             y =y +x.charAt(i);
		//         }System.out.println(y);


		//        //reverse first word only
		//			String x = "darshan Mehtre";
		//			String array[]=x.split(" ");
		//        String y = array[0];
		//        String z = array[1];
		//        String D = "";
		//        for(int i=y.length()-1; i>=0 ; i--){
		//            D = D + y.charAt(i);
		//        }D = D + " " + z;
		//        System.out.println(D);

		
		//		//series from 1 to 10
		//		for(int i=1 ; i<=10 ; i++) {
		//			System.out.print(i + ",");
		//		}


		//		//fabbonacci series
		//		int num1=1;
		//		int num2=1;
		//		int num=0;
		//		for(int i=1 ; i<=10 ; i++) {
		//			num = num1 + num2;
		//			System.out.print(num+",");
		//			num1=num2;
		//			num2=num;
		//		}


		//		//reverse name
		//		String x = "darshan mehtre";
		//		String y = "";
		//		for(int i=x.length()-1;i>=0;i--) {
		//			y=y+x.charAt(i);
		//		}System.out.println(y);


		//		//extract digits from the string
		//		String x = "darshan123 mehtre456";
		//		String y = "";
		//		for ( int i=0; i<x.length(); i++) {
		//			Character c = x.charAt(i);
		//			if (Character.isDigit(c)) {
		//				y = y + c;
		//			}
		//		}System.out.println(y);



		//frequency of character from a string
		String x = "darshan";
		HashMap <Character, Integer> hm = new HashMap <Character, Integer>();
		for(int i=0; i<x.length();i++) {
			if(hm.containsKey(x.charAt(i))) {
				int count = hm.get(x.charAt(i))+1;
				hm.put(x.charAt(i), count);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}for(Map.Entry<Character, Integer>hm1: hm.entrySet()) {
						if(hm1.getValue()>1)	//for occurring of duplicate/greater than 1
//						if(hm1.getValue()==1)	//for occurring of unique character
			System.out.println(hm1.getKey() + " = " + hm1.getValue());
		}
	
//		//reverse each word seprately
//	    String x = "darshan shriram mehtre";
//	    String y = "";
//	    String arrayx[] = x.split(" ");
//	    for ( int j=0 ; j<arrayx.length; j++) {
//	    	String z = "";
//	    	String a = arrayx[j];
//	    for( int i=a.length()-1; i>=0 ; i--) {
//	    	z = z + a.charAt(i);
//	    }y = y + " " + z;
//	    }System.out.println(y);
	    
		
		
	}
}