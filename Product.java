package main;

public class Product {
	
	String name;
	float price;
	
//	This is a method and it must be 
//	the same name within the class so it 
//	will automatically be a constructor
	Product(String name, float price){
		this.name = name;
		this.price = price;
		
		System.out.println(name + " Created ");
		System.out.println("PHP. " + price );
	}

}
