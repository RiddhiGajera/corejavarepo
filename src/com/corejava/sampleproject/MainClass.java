package com.corejava.sampleproject;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		System.out.println("Creating Singleton class object...");
		SingletonClass singleton = SingletonClass.getInstance();
		System.out.println(singleton.hashCode());
		System.out.println("Once again Creating Singleton class object...");
		SingletonClass singletonOne = SingletonClass.getInstance();
		System.out.println(singletonOne.hashCode());
	}

}
