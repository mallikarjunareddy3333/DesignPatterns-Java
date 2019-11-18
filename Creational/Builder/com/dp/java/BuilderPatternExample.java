package com.dp.java;

public class BuilderPatternExample {

	public static void main(String[] args) {
		Cake cake = new Cake.CakeBuilder().suger(1).butter(0.5).
				eggs(2).vanila(2).flour(1.5).bakingpowder(0.75).milk(0.5).build();
		System.out.println(cake.toString());
	}

}
