package com.dp.java;

public class Client {
	public static void main(String[] args) {
		ItemRegistry registry = new ItemRegistry();
		Book myBook = (Book) registry.createBasicItem("Book");
		myBook.setTitle("Custom Title"); // etc
		
		System.out.println(myBook + " - " + myBook.hashCode());
		
		Book myBook1 = (Book) registry.createBasicItem("Book");
		myBook1.setTitle("Custom Title1"); // etc
		
		System.out.println(myBook1 + " - " + myBook1.hashCode());
		
	}
}
