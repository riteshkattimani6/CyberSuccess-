package STREAMapi;

import java.util.Comparator;

public class ProductNameCamparator  implements Comparator<Product>{
	
	public int compare(Product o1, Product o2) {
		String x = o1.getName();
		String y = o2.getName();
		return x.compareTo(y);
	}

}
