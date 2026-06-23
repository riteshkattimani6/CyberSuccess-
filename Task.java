package STREAMapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("hello");
//		list.add("hi");
//		list.add("bye");
//		
//		
//		int sum = list.stream().mapToInt(x->x.length()).sum();
//		System.out.println(sum);
		
		
		List<String> list = Arrays.asList("hello","hi","bye");
		
		
		int sum = list.stream().mapToInt(x->x.length()).sum();
		System.out.println(sum);
		
		
		
	}
}
