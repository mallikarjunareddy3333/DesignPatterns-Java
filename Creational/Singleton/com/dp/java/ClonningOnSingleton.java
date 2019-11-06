package com.dp.java;

class Singleton3 implements Cloneable {

	public static Singleton3 instance = new Singleton3();

	private Singleton3() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

}

public class ClonningOnSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton3 instance1 = Singleton3.instance;
		Singleton3 instance2 = (Singleton3) instance1.clone();

		System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode());

	}

}
