package com.code.singleton;

public class SingletonLazy {

	private static SingletonLazy singleton;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			synchronized (SingletonLazy.class) {
				if (singleton == null) {
					singleton = new SingletonLazy();
				}
			}
		}
		return singleton;
	}
}
