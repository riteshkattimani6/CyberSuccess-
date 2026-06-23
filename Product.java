package PracticeQuestion;

public class Product {
	int pid;
	String name;
	String category;
	double Price;
	int qty;
	public Product() {
		super();
	}
	public Product(int pid, String name, String category, double price, int qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.category = category;
		this.Price = price;
		this.qty = qty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return pid + " " + name + " " + category + " " + Price + " " + qty;
	}
	
}
