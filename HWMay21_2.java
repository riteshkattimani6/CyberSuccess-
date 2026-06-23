package PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class HWMay21_2 {
	public static void main(String[] args) {
		ArrayList<HWMay21> products = new ArrayList<HWMay21>();
		products.add(new HWMay21(1 ,"Mobile ", 22000));
		products.add(new HWMay21(2,"Headphones",2000));
		products.add(new HWMay21(3,"Laptop",50000));
		products.add(new HWMay21(4,"Charger",1000));
		products.add(new HWMay21(5,"Keyboard",1500));
		
		
		System.out.println("size ...1 ..." + products.size());
		for(int i = 0;i<products.size() ;i++) {
			System.out.println(products.get(i));
		}
		
		System.out.println("....2 enhanced for...." + products.size());

		for(HWMay21 c : products) {
		    System.out.println(c);
		}
		
		System.out.println("....3 using iterator" + products.size());
		Iterator<HWMay21> itr = products.iterator();
		while(itr.hasNext()) {
			HWMay21 country = itr.next();
			System.out.println(country);
		}
		
		System.out.println("...4 using list iterator....forword");
		ListIterator<HWMay21> litr = products.listIterator();
		while(litr.hasNext()) {
			HWMay21 country = litr.next();
			System.out.println(country);
		}
		
		
		System.out.println("....5 Enumeration...........");
		Enumeration<HWMay21> enumeration = Collections.enumeration(products);
		while(enumeration.hasMoreElements()) {
			HWMay21 country = enumeration.nextElement();
			System.out.println(country);
		}
		
		System.out.println("....6 using lamda Expression...");
		products.forEach(country->System.out.println(country));
		
		
		System.out.println("....7 using method Ref...");
		products.forEach(System.out::println);
		
		System.out.println("....8 using stream API...");
		products.stream().forEach(c -> System.out.println(c));
		
		
	}
}
