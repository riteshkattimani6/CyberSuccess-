package STREAMapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientD {
	public static void main(String[] args) {
		List<String> countries  = new ArrayList<String>();
		countries.add("Mexico");
		countries.add("Norway");
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Iran");
		countries.add("japan");
		countries.add("Russia");
		countries.add("Germany");
		countries.add("Bangladesh");
		countries.add("China");
		countries.add("Afganistan");
		
		
		//what is differance in the collection and collections
		
//		countries.stream()
//		.sorted()
//		.forEach(x->System.out.println(x));
		
		
		Collections.sort(countries);
		countries.forEach(x->System.out.println(x));
	}
}
