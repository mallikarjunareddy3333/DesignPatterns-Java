package com.dp.java;

//Java program for Enum type singleton
enum SingletonEnum {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class SingletonEnumDemo {
	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;

		System.out.println("instance1.hashCode():- " + singleton.hashCode());
		System.out.println("instance2.hashCode():- " + singleton.hashCode());
		singleton = SingletonEnum.INSTANCE;
		System.out.println("instance3.hashCode():- " + singleton.hashCode());
		
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}