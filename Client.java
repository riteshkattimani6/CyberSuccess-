package PracticeQuestion;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Product p1 = new Product(101,"IPhone","Electronics",60000,10);
		Product p2 = new Product(102,"Redmi","Electronics",25000,30);
		Product p3 = new Product(112,"pen","Stationary",50,50);
		Product p4 = new Product(116,"Books","Stationary",115,40);
		Product p5 = new Product(119,"Headphones","Electronics",200,50);
		Product p6 = new Product(221,"Writing Pad","Stationary",100,15);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		//Find the total number of product
		System.out.println("Number of Product " + list.size() );
		//Total Number of Units
		int unit = 0;
		for(Product t: list)
		unit = unit + t.getQty();
		System.out.println(unit);
		//total values of all assets in store
		double value = 0;
		for(Product t: list)
		value = value + t.getQty()*t.getPrice();
		System.out.println(value);
		//most expensive product
		Product biggest = list.get(0);
		for(Product t: list)
			biggest =t;
		System.out.println(biggest);
		
		//Products between 100 and 500
		for (Product p : list) {
            if (p.getPrice() >= 100 && p.getPrice() <= 500) {
                System.out.println(p.getName());
            }
        }
		//Products with quantity 0
		for (Product p : list) {
            if (p.getQty() == 0) {
                System.out.println(p.getName());
            }
        }
		
		//Names of electronics products
		for (Product p : list) {
            if (p.getCategory().equals("electronics")) {
                System.out.println(p.getName());
            }
        }
		//Display full electronics products
		System.out.println("Electronics products:");
        for (Product p : list) {
            if (p.getCategory().equalsIgnoreCase("electronics")) {
                System.out.println(p.getName() + " - " + p.getPrice());
            }
        }
	}

}
