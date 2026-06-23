package STREAMapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product implements Comparable<Product> {
	int id;
	String name;
	double price;

	@Override
	public int compareTo(Product o) {
//		Double price1 = this.getPrice();
//		Double price2 = o.getPrice();
		
		Integer id1 = this.getId();
		Integer id2 = o.getId();
		
		return id1.compareTo(id2);
	}
}
