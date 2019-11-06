package com.dp.java;

//Classical Java implementation of singleton  
//design pattern
public class Singleton {
	
	private volatile static Singleton obj;
	//private static Singleton obj = new Singleton() ;
	
	private Singleton() {
		
	}
	
	// private constructor to force use of 
    // getInstance() to create Singleton object 
	public static Singleton getInstance() {
		if (obj == null) {
			
			// To make thread safe 
			synchronized(Singleton.class) {
				// check again as multiple threads 
                // can reach above step 
				if (obj == null) {
					obj = new Singleton();
				}
			}
		}
		
		return obj;
	}
	
}
