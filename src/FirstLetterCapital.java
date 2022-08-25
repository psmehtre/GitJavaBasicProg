
public class FirstLetterCapital {

	public static void main(String [] args) {
		String x = "darshan shriram mehtre";
		String[] y = x.split(" ");
		String z = "";
		for(int i=0; i<y.length; i++){
			for(int j=0; j<y[i].length(); j++) {
				if(j==0) {
					z+= Character.toUpperCase(y[i].charAt(j));
				}else {
					z+= y[i].charAt(j);
				}
			}z+=" ";	
		}System.out.println(z);
	}
}