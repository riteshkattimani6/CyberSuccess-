package STREAMapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ClientProduct {
	public static void main(String[] args) {
		Product p1 = new Product(107,"pen",10);
		Product p2 = new Product(109,"pencil",7);
		Product p3 = new Product(110,"Notebook",40);
		Product p4 = new Product(111,"ereser",5);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		System.out.println("________________sort by ID__________________");
		Collections.sort(products);
		products.stream().forEach(x->System.out.println(x));
		
		System.out.println("________________________sort by name______________________________");
		Collections.sort(products, new ProductNameCamparator().reversed());
		products.stream().forEach(x->System.out.println(x));
		
		System.out.println("______________________sort by price__________________________");
		Collections.sort(products, new ProductPriceComparator().reversed());
		products.stream().forEach(b->System.out.println(b));
	}

}
