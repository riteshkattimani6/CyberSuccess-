package STREAMapi;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Italy");
		countries.add("Pakitan");
		countries.add("bangladesh");
		countries.add("USA");
		countries.add("japan");
		
		countries.stream().filter(x->x.length()>=5).map(a->a.length()).forEach(b->System.out.println(b));
	}

}
