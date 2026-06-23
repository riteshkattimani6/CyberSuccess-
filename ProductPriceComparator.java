package STREAMapi;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
	 @Override
	public int compare(Product o1, Product o2) {
		Double x1= o1.getPrice();
		Double x2 = o2.getPrice();
		return x1.compareTo(x2)
				
				 	    
				 ;
	}
}