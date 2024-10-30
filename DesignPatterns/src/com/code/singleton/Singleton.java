package com.code.singleton;

public class Singleton {
	
	private static Singleton singleton;
	private Singleton() {}
	//Early Initialization
	public static Singleton method() {
		return singleton;
	}

}
