
public class VowelsCount {

	public static void main(String [] args) {
		String x = "darshan mehtre";
		int count = 0;
		for ( int i=0 ; i<x.length(); i++) {
			Character c = x.charAt(i);

			if(c =='a'|| c =='e'|| c =='i'||c =='o'||
					c =='u'||c =='A'||c =='E'||c =='I'||
					c =='O'||c =='U') {
				count = count +1;
			}
		}System.out.println("The vowels in the strings are: " + count);


	}
}