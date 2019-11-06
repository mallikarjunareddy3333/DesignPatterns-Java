package com.dp.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// public instance initialized when loading the class
	public static Singleton2 instance = new Singleton2();

	private Singleton2() {
		// private constructor
	}
	
	protected Object readResolve() {
		return instance;
	}

}

public class SerializationOnSingleton {

	public static void main(String[] args) {

		try {
			Singleton2 instance1 = Singleton2.instance;
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
			oos.writeObject(instance1);

			oos.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
			Singleton2 instance2 = (Singleton2) in.readObject();

			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
