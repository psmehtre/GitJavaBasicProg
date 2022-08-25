import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EraseDuplicate {

	public static void main(String [] args) {
		//FOR String
		String a="darshan mehtre";
		String b="";
		ArrayList<Character> ar=new ArrayList<Character>();
		for (int i=0 ; i<a.length() ; i++){
			if(!ar.contains(a.charAt(i))){
				ar.add(a.charAt(i));
				b=b + a.charAt(i);
			}
		}
		System.out.println(b);
		
		
		//for integers
		ArrayList<Integer> mark = new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1));
		List<Integer> unique = mark.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
	}
}