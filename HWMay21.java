package PracticeQuestion;

public class HWMay21 {
	int i;
	String name;
	double price;
	public HWMay21() {
		super();
	}
	public HWMay21(int i, String name, double price) {
		super();
		this.i = i;
		this.name = name;
		this.price = price;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return " " + i + "  " + name + "  " + price; 
	}
	
}
