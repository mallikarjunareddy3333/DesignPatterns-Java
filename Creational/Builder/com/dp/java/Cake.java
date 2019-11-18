package com.dp.java;

public class Cake {

	private final double sugar;
	private final double butter;
	private final int eggs;
	private final int vanila;
	private final double flour;
	private final double bakingpowder;
	private final double milk;
	private final int cherry;

	public static class CakeBuilder {
		private double sugar; // cup
		private double butter; // cup
		private int eggs;
		private int vanila; // spoon
		private double flour; // cup
		private double bakingpowder; // spoon
		private double milk; // cup
		private int cherry;

		public CakeBuilder suger(double cup) {
			this.sugar = cup;
			return this;
		}

		public CakeBuilder butter(double cup) {
			this.butter = cup;
			return this;
		}

		public CakeBuilder eggs(int number) {
			this.eggs = number;
			return this;
		}

		public CakeBuilder vanila(int spoon) {
			this.vanila = spoon;
			return this;
		}

		public CakeBuilder flour(double cup) {
			this.flour = cup;
			return this;
		}

		public CakeBuilder bakingpowder(double spoon) {
			this.bakingpowder = spoon;
			return this;
		}

		public CakeBuilder milk(double cup) {
			this.milk = cup;
			return this;
		}

		public CakeBuilder cherry(int number) {
			this.cherry = number;
			return this;
		}

		// return fully build object
		public Cake build() {
			return new Cake(this);
		}

	}

	public Cake(CakeBuilder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.flour = builder.flour;
		this.bakingpowder = builder.bakingpowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
				+ flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + "]";
	}
	
}